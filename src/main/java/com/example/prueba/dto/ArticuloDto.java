package com.example.prueba.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ArticuloDto {
    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, readOnly = true)
    @NotEmpty
    @Size(min = 0, max = 10)
    private String id;
    @NotEmpty
    @Size(min = 0, max = 20)
    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, readOnly = true)
    private String nombre;
    @NotEmpty
    @Size(min = 0, max = 200)
    private String descripcion;
    @NotEmpty
    @Digits(integer=10, fraction=2)
    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, readOnly = true)
    private double precio;
    @NotEmpty
    @Size(min = 0, max = 10)
    private String modelo;

    public ArticuloDto(String modelo, double precio, String descripcion, String nombre, String id) {
        super();
        this.modelo = modelo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id = id;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
