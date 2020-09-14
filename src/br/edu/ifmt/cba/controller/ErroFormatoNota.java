package br.edu.ifmt.cba.controller;

public class ErroFormatoNota extends RuntimeException{

    
    public ErroFormatoNota (String message){
        super(message);
    }
}
