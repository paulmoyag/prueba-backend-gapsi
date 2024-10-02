package com.example.prueba.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Articulo {
    @Id
    String id;
    String nombre;
    String descripcion;
    Double precio;
    String modelo;

    public Articulo(){

    }

    public Articulo(String id, String nombre, String descripcion, Double precio, String modelo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
