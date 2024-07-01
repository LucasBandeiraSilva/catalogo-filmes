package com.film.catalog.film.infra;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.film.catalog.film.exceptions.MovieListEmptyException;
import com.film.catalog.film.exceptions.MovieNotCreatedException;
import com.film.catalog.film.exceptions.MovieNotFoundException;
import com.film.catalog.film.exceptions.StandartError;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<StandartError> movieNotFoundHandler(MovieNotFoundException exception, HttpServletRequest request){
        StandartError standartError = new StandartError();
        standartError.setTimeStamp(Instant.now());
        standartError.setStatus(HttpStatus.NOT_FOUND.value());
        standartError.setError("Movie not found");
        standartError.setMessage(exception.getMessage());
        standartError.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standartError);
    }
    @ExceptionHandler(MovieNotCreatedException.class)
    public ResponseEntity<StandartError> movieNotCreatedHnadler(MovieNotCreatedException exception, HttpServletRequest request,BindingResult bindingResult){
        StandartError standartError = new StandartError();
        standartError.setTimeStamp(Instant.now());
        standartError.setStatus(HttpStatus.NOT_FOUND.value());
        standartError.setError("Error adding a movie");
        standartError.setMessage(exception.getMessage());
        standartError.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standartError);
    }

    @ExceptionHandler(MovieListEmptyException.class)
    public ResponseEntity<StandartError> MovieListEmptyHandler(MovieNotCreatedException exception, HttpServletRequest request){
        StandartError standartError = new StandartError();
        standartError.setTimeStamp(Instant.now());
        standartError.setStatus(HttpStatus.NOT_FOUND.value());
        standartError.setError("Error adding a movie");
        standartError.setMessage(exception.getMessage());
        standartError.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standartError);
    }
}
