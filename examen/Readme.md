# Examen Acceso a Datos

Nombre | Apellidos | Fecha | Modulo | Modulo
---------|----------|---------|---------|---------
 Javier | Segovia Martinez | 15-10-2024 | Acceso a datos | Tema 1

## Proyecto
Para este proyecto que debemos hacer, deberemos hacer un proyecto maven, sin archetype, donde iremos agregando dependencias al pom.xml, agregando un proyecto java, donde sera tipo maven, sin archetype como he comentado, donde deberemos darle:
-   Paquete: "com.iesvdc.acceso"
-   Artefacto: "examen"
-   Clase principal: "App.java"

## Dependencias a agregar
Deberemos agregar las dependencias, lo cualo se hara pulsando " Ctrl " + " Shift " + " P " y deberemos buscar la dependencia adecuada que nos pide.
La dependencia de javax activation es esta

```xml
<dependency>
            <groupId>javax.activation</groupId>
            <artifactId>activation</artifactId>
            <version>1.1.1</version>
        </dependency>
```

La dependencia de jaxb2 codehaus es esta

```xml
<dependency>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>jaxb2-maven-plugin</artifactId>
            <version>3.2.0</version>
            <type>maven-plugin</type>
        </dependency>
```

La dependencia de eclipse moxy es esta

```xml
<dependency>
            <groupId>org.eclipse.persistence</groupId>
            <artifactId>org.eclipse.persistence.moxy</artifactId>
            <version>2.7.7</version>
        </dependency>
```

Y la dependencia de jakarta json es esta

```xml
<dependency>
            <groupId>jakarta.json</groupId>
            <artifactId>jakarta.json-tck</artifactId>
            <version>2.1.1</version>
            <type>pom</type>
        </dependency>
```

Para seguir debemos crear una carpeta modelos, donde crearemos nuestras clases modelo que son proyecto, responsable, tarea y LocalDateAdapter.java.
Dentro de LocalDateAdapter.java deberemos añadir encima de private static final lo siguiente para que funcione.
```java
@XmlElement
@XmlJavaTypeAdapter(LocalDateAdapter.class)
```

Aparte dentro de la carpeta modelos Proyecto.java, Responsable.java y Tareas.java tendremos que crear todos los atributos de cada clase modelo, y tambien debemos añadir en las clases sus respectivos XmlRootElement y XmlAccesorType
```java
@XmlRootElement(name = "  ")
@XmlAccessorType (XmlAccessType.FIELD)
```
## Marshalling y UnMarshalling
Una vez hechos todos los modelos, deberemos realizarlo en App.java, si se pasa el numero correcto de argumentos se haria, pero si, no y se explicaria cual es su uso

Para pasar de XML a JSON deberemos primero hacer unmarshall de XML y luego hacer marhsall a JSON


        
