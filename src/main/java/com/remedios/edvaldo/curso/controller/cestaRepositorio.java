package com.remedios.edvaldo.curso.controller;

import com.remedios.edvaldo.curso.CestaBasica.Cesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface cestaRepositorio extends JpaRepository<Cesta, Long> {
    List<Cesta> findAllByAtivoTrue();

}
