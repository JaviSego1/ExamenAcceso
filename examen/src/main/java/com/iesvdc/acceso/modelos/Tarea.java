package com.iesvdc.acceso.modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Tarea {

    private String titulo;
    private String descripcion;
    private LocalDateAdapter fechaInicio;
    private LocalDateAdapter fechaFin;
    private Responsable responsable;


    public Tarea() {
    }

    public Tarea(String titulo, String descripcion, LocalDateAdapter fechaInicio, LocalDateAdapter fechaFin, Responsable responsable) {
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

    public LocalDateAdapter getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(LocalDateAdapter fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateAdapter getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(LocalDateAdapter fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Responsable getResponsable() {
        return this.responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public Tarea titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Tarea descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }

    public Tarea fechaInicio(LocalDateAdapter fechaInicio) {
        setFechaInicio(fechaInicio);
        return this;
    }

    public Tarea fechaFin(LocalDateAdapter fechaFin) {
        setFechaFin(fechaFin);
        return this;
    }

    public Tarea responsable(Responsable responsable) {
        setResponsable(responsable);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tarea)) {
            return false;
        }
        Tarea tarea = (Tarea) o;
        return Objects.equals(titulo, tarea.titulo) && Objects.equals(descripcion, tarea.descripcion) && Objects.equals(fechaInicio, tarea.fechaInicio) && Objects.equals(fechaFin, tarea.fechaFin) && Objects.equals(responsable, tarea.responsable);
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
