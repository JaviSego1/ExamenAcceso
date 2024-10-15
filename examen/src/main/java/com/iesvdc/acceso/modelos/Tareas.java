package com.iesvdc.acceso.modelos;

import java.time.LocalDate;
import java.util.Objects;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "tareas")
@XmlAccessorType (XmlAccessType.FIELD)
public class Tareas {

    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Responsable responsable;



    public Tareas() {
    }

    public Tareas(String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Responsable responsable) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Responsable getResponsable() {
        return this.responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public Tareas titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Tareas descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }

    public Tareas fechaInicio(LocalDate fechaInicio) {
        setFechaInicio(fechaInicio);
        return this;
    }

    public Tareas fechaFin(LocalDate fechaFin) {
        setFechaFin(fechaFin);
        return this;
    }

    public Tareas responsable(Responsable responsable) {
        setResponsable(responsable);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tareas)) {
            return false;
        }
        Tareas tareas = (Tareas) o;
        return Objects.equals(titulo, tareas.titulo) && Objects.equals(descripcion, tareas.descripcion) && Objects.equals(fechaInicio, tareas.fechaInicio) && Objects.equals(fechaFin, tareas.fechaFin) && Objects.equals(responsable, tareas.responsable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descripcion, fechaInicio, fechaFin, responsable);
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", fechaInicio='" + getFechaInicio() + "'" +
            ", fechaFin='" + getFechaFin() + "'" +
            ", responsable='" + getResponsable() + "'" +
            "}";
    }
    
    
    
}
