package com.film.catalog.film.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.film.catalog.film.entidade.Filme;

public interface FilmeRepository extends JpaRepository<Filme,Long> {
    List<Filme>findAllBystatusTrue();
}
