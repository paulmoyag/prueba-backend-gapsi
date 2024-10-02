package com.example.prueba.controller;

import com.example.prueba.dto.ArticuloDto;
import com.example.prueba.exception.ArticuloNotFoundException;
import com.example.prueba.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @PostMapping(value = "/articulo")
    public ResponseEntity<ArticuloDto> creaArticulo(@RequestBody ArticuloDto articuloDto){
        ArticuloDto articuloCreado = articuloService.creaArticulo(articuloDto);

        return new ResponseEntity<>(articuloCreado, HttpStatus.CREATED);
    }

    @GetMapping(value = "/list/{id}")
    public ResponseEntity<List<ArticuloDto>> listarArticulo(@PathVariable("id")String id){
        List<ArticuloDto> articuloDtoList = articuloService.listarArticulos(id);

        return new ResponseEntity<>(articuloDtoList,HttpStatus.OK);
    }

    @DeleteMapping(value = "/articulo/{employeeId}")
    public ResponseEntity<HttpStatus> deleteEmployees(@PathVariable("employeeId") String articuloId)
            throws ArticuloNotFoundException {
        articuloService.deleteArticulo(articuloId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @PutMapping(value = "/articulo")
    public ResponseEntity<ArticuloDto> updateArticulo(@RequestBody ArticuloDto articuloDto)
            throws ArticuloNotFoundException{
        ArticuloDto createdEmployee = articuloService.updateArticulo(articuloDto);
        return new ResponseEntity<>(createdEmployee, HttpStatus.OK);
    }
}
