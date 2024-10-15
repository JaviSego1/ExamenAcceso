package com.iesvdc.acceso.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @XmlElement
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;

    @Override
    public LocalDate unmarshal(String date) {
        return LocalDate.parse(date, dateFormatter);
    }

    @Override
    public String marshal(LocalDate localDate) {
        return localDate.format(dateFormatter);
    }
}