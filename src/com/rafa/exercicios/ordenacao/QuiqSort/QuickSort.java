package com.rafa.exercicios.ordenacao.QuiqSort;

import java.util.Random;

public class QuickSort implements IOrdenacao{

    private int[] vetor;

    public QuickSort(){

    }

    public QuickSort(int tamanho) {
        gerarVetor(tamanho);
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int[] gerarVetor(int tamanho) {
        vetor = new int[tamanho];
        Random gerador = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = gerador.nextInt(100);
        }
        System.out.println("Os números do vetor são: ");
        return vetor;
    }

    public void mostrarVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O valor no indice " + i + "º é: " + vetor[i]);
        }
    }

    public void quickSortCrescente(int[] vetor, int ladoEsquerdo, int ladoDireito) {
        if (ladoEsquerdo < ladoDireito) {
            int posiPivot = separarCrescente(vetor, ladoEsquerdo, ladoDireito);
            quickSortCrescente(vetor, ladoEsquerdo, posiPivot - 1);
            quickSortCrescente(vetor, posiPivot + 1, ladoDireito);
        }
    }

    private int separarCrescente(int[] vetor, int ladoEsquerdo, int ladoDireito) {
        int i = ladoEsquerdo + 1;
        int j = ladoDireito;
        int pivo = vetor[ladoEsquerdo];
        while (i <= j) {
            if (vetor[i] <= pivo) i++;
            else if (vetor[j] > pivo) j--;
            else if (i <= j) {
                trocar(vetor, i, j);
                i++;
                j--;
            }
        }
        trocar(vetor, ladoEsquerdo, j);
        return j;
    }

    public void quickSortDecrescente(int[] vetor, int ladoEsquerdo, int ladoDireito) {
        if (ladoEsquerdo < ladoDireito) {
            int posiPivot = separarDecrescente(vetor, ladoEsquerdo, ladoDireito);
            quickSortDecrescente(vetor, ladoEsquerdo, posiPivot - 1);
            quickSortDecrescente(vetor, posiPivot + 1, ladoDireito);
        }
    }

    private int separarDecrescente(int[] vetor, int ladoEsquerdo, int ladoDireito) {
        int i = ladoEsquerdo + 1;
        int j = ladoDireito;
        int pivo = vetor[ladoEsquerdo];
        while (i <= j) {
            if (vetor[i] >= pivo) i++;
            else if (vetor[j] < pivo) j--;
            else if (i <= j) {
                trocar(vetor, i, j);
                i++;
                j--;
            }
        }
        trocar(vetor, ladoEsquerdo, j);
        return j;
    }

    private void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }

    @Override
    public void ordenar(int[] valores) {
        int[] vetor = new int[valores.length];
        setVetor(valores);
        mostrarVetor();
        quickSortCrescente(valores, 0, valores.length-1);
        System.out.println("Vetor ordenador de forma Crescente");
        mostrarVetor();
    }

    @Override
    public void ordenarDecrescente(int[] valores) {
        int[] vetor = new int[valores.length];
        setVetor(valores);
        mostrarVetor();
        quickSortDecrescente(valores, 0, valores.length-1);
        System.out.println("Vetor ordenador de forma Decrescente");
        mostrarVetor();

    }
}
