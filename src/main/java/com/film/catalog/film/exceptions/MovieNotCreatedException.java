package com.film.catalog.film.exceptions;


public class MovieNotCreatedException extends RuntimeException {
    public MovieNotCreatedException() {
        super("Filme não criado");
    }
    public MovieNotCreatedException (String menssage){
        super(menssage);
    }
}
