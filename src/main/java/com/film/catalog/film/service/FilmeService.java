package com.film.catalog.film.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.film.catalog.film.dto.FilmeDto;
import com.film.catalog.film.entidade.Filme;
import com.film.catalog.film.repository.FilmeRepository;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public ResponseEntity<List<Filme>> findAll() {
        return ResponseEntity.ok().body(filmeRepository.findAll());
    }

    public ResponseEntity<Filme> findById(Long id) {
        Optional<Filme> filme = filmeRepository.findById(id);
        if (filme.isPresent()) {
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
