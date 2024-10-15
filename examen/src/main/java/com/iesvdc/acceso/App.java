package com.iesvdc.acceso;

import java.io.File;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;

import com.iesvdc.acceso.modelos.Proyecto;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class App {
    public static void main(String[] args) {

        if (args.length >= 1) {

            usage();

        } else {
            
            Proyecto proyecto = new Proyecto();

            JAXBContext jaxbContext; 
            
            try {

                System.setProperty("javax.xml.bind.JAXBContextFactory", "org.eclipse.persistence.jaxb.JAXBContextFactory");
            
                jaxbContext = JAXBContext.newInstance(proyecto.getClass());

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();


                Object objeto = jaxbUnmarshaller.unmarshal(new File("datos.xml"));
                proyecto = (Proyecto) objeto;
                System.out.println(proyecto.toString());


                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

                // Para JSON
                jaxbMarshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
                jaxbMarshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);

                jaxbMarshaller.marshal(proyecto, new File("nuevo.json"));
    
            } catch (JAXBException e) {
                System.err.println("Error");
            }

        }

    }

    private static void usage(){
        System.out.println("Uso del programa:");
        System.out.println("mvn esex:java -Dexec:args" + "archivo a ejecutar");
    }


}