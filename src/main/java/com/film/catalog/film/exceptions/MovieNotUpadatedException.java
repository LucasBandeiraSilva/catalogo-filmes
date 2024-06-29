package com.film.catalog.film.exceptions;

public class MovieNotUpadatedException extends RuntimeException {
    public MovieNotUpadatedException(){
        super("Movie not updated");
    }
    public MovieNotUpadatedException(String message){
        super(message);
    }
}
