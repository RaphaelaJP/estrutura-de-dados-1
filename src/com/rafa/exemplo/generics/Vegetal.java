package com.rafa.exemplo.generics;

public class Vegetal {

    protected String nome;

    public Vegetal(){

    }
    public Vegetal(String nome){
        this.nome= nome;
    }

    public String toString(){
        return "Vegetal: " + nome;
    }
}
