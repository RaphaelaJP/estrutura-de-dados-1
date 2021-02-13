package com.rafa.aula.ExerciciosRecurssivos.Exer03;

public class Fibonacci {

    private int num;
    private int cont;

    public Fibonacci() {
        this.cont = 0;

    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int fibonacciRecurssivo(int num) {
        cont++;
        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacciRecurssivo(num - 1) + fibonacciRecurssivo(num - 2);
        }
    }