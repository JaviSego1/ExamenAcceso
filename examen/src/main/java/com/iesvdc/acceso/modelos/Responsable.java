package com.iesvdc.acceso.modelos;
import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "responsable")
@XmlAccessorType (XmlAccessType.FIELD)
public class Responsable {

    private String nombre;
    private String puesto;
    private String email;
    private Integer experiencia;


    public Responsable() {
    }

    public Responsable(String nombre, String puesto, String email, Integer experiencia) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.email = email;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Responsable nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Responsable puesto(String puesto) {
        setPuesto(puesto);
        return this;
    }

    public Responsable email(String email) {
        setEmail(email);
        return this;
    }

    public Responsable experiencia(Integer experiencia) {
        setExperiencia(experiencia);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Responsable)) {
            return false;
        }
        Responsable responsable = (Responsable) o;
        return Objects.equals(nombre, responsable.nombre) && Objects.equals(puesto, responsable.puesto) && Objects.equals(email, responsable.email) && Objects.equals(experiencia, responsable.experiencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, puesto, email, experiencia);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", puesto='" + getPuesto() + "'" +
            ", email='" + getEmail() + "'" +
            ", experiencia='" + getExperiencia() + "'" +
            "}";
    }


    
    
}
