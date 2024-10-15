package com.iesvdc.acceso.modelos;
import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "proyecto")
@XmlAccessorType (XmlAccessType.FIELD)
public class Proyecto {

    private String nombre;
    private String descripcion;
    private Tareas tarea;


    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, Tareas tarea) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarea = tarea;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tareas getTarea() {
        return this.tarea;
    }

    public void setTarea(Tareas tarea) {
        this.tarea = tarea;
    }

    public Proyecto nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Proyecto descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }

    public Proyecto tarea(Tareas tarea) {
        setTarea(tarea);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proyecto)) {
            return false;
        }
        Proyecto proyecto = (Proyecto) o;
        return Objects.equals(nombre, proyecto.nombre) && Objects.equals(descripcion, proyecto.descripcion) && Objects.equals(tarea, proyecto.tarea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, tarea);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", tarea='" + getTarea() + "'" +
            "}";
    }
    
    
}
