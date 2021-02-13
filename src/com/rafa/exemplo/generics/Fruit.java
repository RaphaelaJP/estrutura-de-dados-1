package com.rafa.exemplo.generics;

public class Fruit extends Vegetal{

    public Fruit(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Fruta: " + nome;
    }

}
