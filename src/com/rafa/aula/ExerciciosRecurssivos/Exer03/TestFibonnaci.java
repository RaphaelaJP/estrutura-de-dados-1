package com.rafa.aula.ExerciciosRecurssivos.Exer03;

import com.rafa.aula.ExerciciosRecurssivos.Exer03.Fibonacci;

public class TestFibonnaci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 10; i++){
            System.out.println("A Sequencia de Fibonacci é: " + f.fibonacciRecurssivo(i));
        }
        System.out.println(" ----------- // --------- ");
        System.out.println("A Quantidade de vezes que a recurssivade foi invocada: " + f.getCont() +".");
    }
}