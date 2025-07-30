package com.javanauta.usuario.infrastructury.expections;

public class ConflictExecption extends RuntimeException {

    public ConflictExecption(String mensagem){
        super(mensagem);
    }

    public ConflictExecption(String mensagem, Throwable throwable){
        super(mensagem);
    }

}
