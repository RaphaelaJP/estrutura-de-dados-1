package com.rafa.exercicios.ordenacao.QuiqSort;

public class TestQuickSort {

    public static void main(String[] args) {

        QuickSort valor = new QuickSort(5);
        valor.mostrarVetor();


        System.out.println(" ");
        System.out.println("--- Ordenadado de forma Crescente pelo QuickSort ---");
        valor.ordenar(valor.getVetor());


        System.out.println(" ");
        System.out.println("--- Ordenado de forma Deccrescente pelo QuickSorte ---");
        valor.ordenarDecrescente(valor.getVetor());

    }
}
