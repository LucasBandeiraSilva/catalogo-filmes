package com.film.catalog.film.exceptions;

public class IdNullException extends RuntimeException {
    public IdNullException(){
        super("Id is null!");
    }
    public IdNullException(String mensage){
        super(mensage);
    }
}
