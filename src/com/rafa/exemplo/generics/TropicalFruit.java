package com.rafa.exemplo.generics;

public class TropicalFruit extends Fruit{

    public TropicalFruit(String nome) {
        super(nome);
    }

    public String toString(){
        return "Fruta tropical : " + nome + " brow!";
    }
}
