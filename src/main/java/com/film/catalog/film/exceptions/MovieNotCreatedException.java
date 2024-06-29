package com.film.catalog.film.exceptions;


public class MovieNotCreatedException extends RuntimeException {
    public MovieNotCreatedException() {
        super("Movie not created");
    }
    public MovieNotCreatedException (String menssage){
        super(menssage);
    }
}
