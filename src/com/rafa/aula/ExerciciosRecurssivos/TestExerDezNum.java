package com.rafa.aula.ExerciciosRecurssivos;

public class TestExerDezNum {
    public static void main(String[] args) {

        DezNumInteiros numero = new DezNumInteiros();
        numero.setNum(1);
        System.out.println(numero.MostrarValorRecurssivo(numero.getNum()));

        System.out.println( " ----- /// --------");
        numero.setNum(10);
        System.out.println(numero.MostrarValorRecurssivoDecrescente(numero.getNum()));
    }
}
