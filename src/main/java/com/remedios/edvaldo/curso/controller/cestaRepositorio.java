package com.remedios.edvaldo.curso.controller;

import com.remedios.edvaldo.curso.CestaBasica.Cesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cestaRepositorio extends JpaRepository<Cesta, Long> {
}
