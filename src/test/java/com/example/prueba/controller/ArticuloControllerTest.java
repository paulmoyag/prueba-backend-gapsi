package com.example.prueba.controller;

import com.example.prueba.dto.ArticuloDto;
import com.example.prueba.service.ArticuloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

@ExtendWith(MockitoExtension.class)
public class ArticuloControllerTest {

    ArticuloController articuloController;

    @InjectMocks
    ArticuloService articuloService;

    @BeforeEach
    void init(){
        articuloController = new ArticuloController();
    }

    //@Test
    void creaArticuloTest() {
        ArticuloDto articuloDtoParam = new ArticuloDto("blanco",100,"Laptop oficina","Laptop DELL","ART01");
        ArticuloDto articuloDtoResponse = new ArticuloDto("blanco",100,"Laptop oficina","Laptop DELL","ART01");
        Mockito.when(articuloService.creaArticulo(articuloDtoParam)).thenReturn(articuloDtoResponse);

        Assert.isTrue(articuloController.creaArticulo(articuloDtoParam).getBody().equals(articuloDtoResponse),"es correcto");
    }
}
