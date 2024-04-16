package com.remedios.edvaldo.curso.remedio;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {

    List<Remedio>findAllByAtivoTrue();
}
