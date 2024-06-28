package com.film.catalog.film.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.film.catalog.film.controller.FilmeController;
import com.film.catalog.film.dto.FilmeDto;
import com.film.catalog.film.entidade.Filme;
import com.film.catalog.film.repository.FilmeRepository;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public ResponseEntity<List<Filme>> findAll() {
        List<Filme> filmeList = filmeRepository.findAll();
        for (Filme filme : filmeList) {
            Link uriFindCatalogoFilmeId = WebMvcLinkBuilder.linkTo(methodOn(FilmeController.class).findById(filme.getId())).withSelfRel();
            filme.add(uriFindCatalogoFilmeId);
        }
        return ResponseEntity.status(HttpStatus.OK).body(filmeList);
    }

    public ResponseEntity<Filme> findById(Long id) {
        Optional<Filme> filme = filmeRepository.findById(id);
        if (filme.isPresent()) {
            Link uri_catalogo_filmes = WebMvcLinkBuilder.linkTo(methodOn(FilmeController.class).findAll()).withRel("Lista de filmes disponiveis");
            filme.get().add(uri_catalogo_filmes);
            return ResponseEntity.ok().body(filme.get());
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Filme> createFilm(FilmeDto filmeDto) {
        var filme = new Filme();
        BeanUtils.copyProperties(filmeDto, filme);
        filmeRepository.save(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body(filme);
    }

    public ResponseEntity<Filme> updateFilmById(Long id, FilmeDto filmeDto) {
        Optional<Filme> filmeOptional = filmeRepository.findById(id);
        if (filmeOptional.isPresent()) {
            var filme = filmeOptional.get();
            BeanUtils.copyProperties(filmeDto, filme);
            filmeRepository.save(filme);
            return ResponseEntity.ok().body(filme);
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Void> deleteFilmById(Long id) {
        Optional<Filme> filmeOptional = filmeRepository.findById(id);
        if (filmeOptional.isPresent()) {
            filmeRepository.deleteById(filmeOptional.get().getId());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.notFound().build();
    }
}
