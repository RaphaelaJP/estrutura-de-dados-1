package com.rafa.exercicios.ordenacao.MergeSort;

public class TestMergeSort {

    public static void main(String[] args) {

        MergrSort valor = new MergrSort(5);

        System.out.println(" ");
        valor.ordenar(valor.getVetor());

        System.out.println(" ");
        valor.ordenarDecrescente(valor.getVetor());
    }
}
