package com.rafa.aula.ExerciciosRecurssivos;

public class TestFibonnaci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i< 10; i++){
            System.out.println("A Sequencia de Fibonacci é: " + f.fibonacciRecurssivo(i));
        }
    }
}