package com.tom.GestionBieres.Exception;

public class RessourceNotFoundException extends RuntimeException{
    public  RessourceNotFoundException (String message){
        super(message);
    }
}
