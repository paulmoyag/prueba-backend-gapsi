package com.example.prueba.service;

import com.example.prueba.dto.ArticuloDto;
import com.example.prueba.entity.Articulo;
import com.example.prueba.exception.ArticuloNotFoundException;
import com.example.prueba.mapper.ArticuloMapper;
import com.example.prueba.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticuloServiceImpl implements ArticuloService{

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public ArticuloDto creaArticulo(ArticuloDto articuloDto) {
        Articulo articulo = ArticuloMapper.mapToArticulo(articuloDto);
        Articulo articuloCreado = articuloRepository.save(articulo);
        return ArticuloMapper.mapToArticuloDto(articuloCreado);
    }

    @Override
    public List<ArticuloDto> listarArticulos(String id) {
        if(!id.isBlank()) {
            return List.of(ArticuloMapper.mapToArticuloDto(articuloRepository.findById(id).get()));
        }else{
            return articuloRepository.findAll()
                    .stream()
                    .map(ArticuloMapper::mapToArticuloDto)
                    .collect(Collectors.toList());
        }
    }

    @Override
    public void deleteArticulo(String id) throws ArticuloNotFoundException {
        if(articuloRepository.findById(id).isPresent()){
            articuloRepository.deleteById(id);
        }else{
            throw new ArticuloNotFoundException("No se encontro el articulo id: "+id);
        }
    }

    @Override
    public ArticuloDto updateArticulo(ArticuloDto articuloDto) throws ArticuloNotFoundException {
        if((articuloRepository.findById(articuloDto.getId()).get()).getId().isEmpty()){
            throw new ArticuloNotFoundException("No se encontro el articulo id: "+articuloDto.getId());
        }

        Articulo articulo = ArticuloMapper.mapToArticulo(articuloDto);
        Articulo articuloCreado = articuloRepository.save(articulo);
        return ArticuloMapper.mapToArticuloDto(articuloCreado);
    }
}
