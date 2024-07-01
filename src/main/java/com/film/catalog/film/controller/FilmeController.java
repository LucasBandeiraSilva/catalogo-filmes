package com.film.catalog.film.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.film.catalog.film.dto.FilmeDto;
import com.film.catalog.film.entidade.Filme;
import com.film.catalog.film.service.FilmeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping()
    public ResponseEntity<List<Filme>> findAll() {
        return filmeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> findById(@PathVariable Long id) {
         return filmeService.findById(id);
    }

    @PostMapping()
    public ResponseEntity<Filme> createFilm(@RequestBody @Valid FilmeDto filmeDto,BindingResult bindingResult) {
        return filmeService.createFilm(filmeDto,bindingResult);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> updateFilmById(@PathVariable Long id, @RequestBody @Valid FilmeDto filmeDto, BindingResult bindingResult) {
        return filmeService.updateFilmById(id, filmeDto, bindingResult);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilmById(@PathVariable Long id) {
         return filmeService.deleteFilmById(id);
    }
}
