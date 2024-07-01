package com.film.catalog.film.exceptions;

public class MovieListEmptyException extends RuntimeException {
    public MovieListEmptyException() {
        super("A lista de filmes do catálogo está vazia");
    }
    public MovieListEmptyException(String message){
        super(message);
    }
}
