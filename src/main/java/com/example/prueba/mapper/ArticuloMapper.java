package com.example.prueba.mapper;

import com.example.prueba.dto.ArticuloDto;
import com.example.prueba.entity.Articulo;

public class ArticuloMapper {
    public static ArticuloDto mapToArticuloDto(Articulo articulo){
        return new ArticuloDto(articulo.getModelo(), articulo.getPrecio(), articulo.getDescripcion(), articulo.getNombre(), articulo.getId());
    }

    public static  Articulo mapToArticulo(ArticuloDto articuloDto){
        return new Articulo(articuloDto.getId(),
                            articuloDto.getNombre(),
                            articuloDto.getDescripcion(),
                            articuloDto.getPrecio(),
                            articuloDto.getModelo());
    }
}
