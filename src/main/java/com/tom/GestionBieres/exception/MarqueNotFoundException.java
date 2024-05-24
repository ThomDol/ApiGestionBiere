package com.tom.GestionBieres.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class MarqueNotFoundException extends RuntimeException{

    public MarqueNotFoundException(String message) {
        super(message);
    }
}
