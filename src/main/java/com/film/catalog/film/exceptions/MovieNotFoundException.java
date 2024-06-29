package com.film.catalog.film.exceptions;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException() {
        super("Movie not found in the database");
    }

    public MovieNotFoundException(String message) {
        super(message);
    }
}
