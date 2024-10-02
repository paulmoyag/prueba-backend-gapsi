package com.example.prueba.service;

import com.example.prueba.dto.ArticuloDto;
import com.example.prueba.exception.ArticuloNotFoundException;

import java.util.List;

public interface ArticuloService {
    ArticuloDto creaArticulo(ArticuloDto articulo);

    List<ArticuloDto> listarArticulos(String id);

    void deleteArticulo(String id) throws ArticuloNotFoundException;

    ArticuloDto updateArticulo(ArticuloDto articuloDto) throws ArticuloNotFoundException;
}
