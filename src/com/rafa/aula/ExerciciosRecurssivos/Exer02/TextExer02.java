package com.rafa.aula.ExerciciosRecurssivos.Exer02;

public class TextExer02 {
    public static void main(String[] args) {
        NumerosInteirosRecurssivosDecrescente num = new NumerosInteirosRecurssivosDecrescente();
        num.setNum(10);
        System.out.println(num.MostrarValorRecurssivoDecrescente(num.getNum()));
    }
}
