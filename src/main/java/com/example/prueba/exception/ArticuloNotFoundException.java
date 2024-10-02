package com.example.prueba.exception;

public class ArticuloNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public ArticuloNotFoundException() {
    }

    public ArticuloNotFoundException(String message) {
        super(message);
    }
}
