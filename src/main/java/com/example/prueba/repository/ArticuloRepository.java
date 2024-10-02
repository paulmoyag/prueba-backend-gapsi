package com.example.prueba.repository;

import com.example.prueba.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, String> {

}