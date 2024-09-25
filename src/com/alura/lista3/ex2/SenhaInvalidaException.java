package com.alura.lista3.ex2;

public class SenhaInvalidaException extends RuntimeException{
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
