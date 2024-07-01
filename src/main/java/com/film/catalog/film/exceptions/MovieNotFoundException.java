package com.film.catalog.film.exceptions;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException() {
        super("Filme não encontrado no catálogo");
    }

    public MovieNotFoundException(String message) {
        super(message);
    }
}
