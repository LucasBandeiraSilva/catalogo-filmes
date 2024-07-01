package com.film.catalog.film.exceptions;

public class IdNullException extends RuntimeException {
    public IdNullException(){
        super("O id está nulo");
    }
    public IdNullException(String mensage){
        super(mensage);
    }
}
