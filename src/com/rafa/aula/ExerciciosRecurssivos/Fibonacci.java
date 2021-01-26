package com.rafa.aula.ExerciciosRecurssivos;

public class Fibonacci {

    private int num;

    public Fibonacci() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int fibonacciRecurssivo(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacciRecurssivo(num - 1) + fibonacciRecurssivo(num - 2);
        }

        public int qtdVezesDeChamadaRecurssiva () {

            return 0;
        }
    }