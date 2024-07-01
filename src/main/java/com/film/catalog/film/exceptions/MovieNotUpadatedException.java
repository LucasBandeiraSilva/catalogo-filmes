package com.film.catalog.film.exceptions;

public class MovieNotUpadatedException extends RuntimeException {
    public MovieNotUpadatedException(){
        super("Filme não atualizado devido a um erro");
    }
    public MovieNotUpadatedException(String message){
        super(message);
    }
}
