package com.rafa.exercicios.ordenacao.MergeSort;

import java.util.Random;

public class MergrSort implements IOrdenacao{

    private int[] vetor;
    private int[] vetorAux;

    public MergrSort(int tamanho) {
        gerarVetor(tamanho);
        vetorAux = new int[vetor.length];
    }

    public MergrSort (){

    }
    public int[] getVetorAux() {
        return vetorAux;
    }

    public void setVetorAux(int[] vetorAux) {
        this.vetorAux = vetorAux;
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
        System.out.println("Números do vetor: ");
        return vetor;
    }

    public void mostrarVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O valor no indice " + i + "º é: " + vetor[i]);
        }
    }

    public void mergeSortCrescente(int[] vetor, int[] vetorAux, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortCrescente(vetor, vetorAux, inicio, meio);
            mergeSortCrescente(vetor, vetorAux, meio + 1, fim);
            intercalarCrescente(vetor, vetorAux, inicio, meio, fim);
        }
    }


    private void intercalarCrescente(int[] vetor, int[] vetorAux, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++)
            vetorAux[k] = vetor[k];

        int i = inicio;
        int m = meio + 1;
        for (int k = inicio; k <= fim; k++) {
            if (i > meio) vetor[k] = vetorAux[m++];
            else if (m > fim) vetor[k] = vetorAux[i++];
            else if (vetorAux[i] < vetorAux[m]) vetor[k] = vetorAux[i++];
            else vetor[k] = vetorAux[m++];
        }
    }

    public void mergeSortDecrescente(int[] vetor, int[] vetorAux, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortDecrescente(vetor, vetorAux, inicio, meio);
            mergeSortDecrescente(vetor, vetorAux, meio + 1, fim);
            intercalarDecrescente(vetor, vetorAux, inicio, meio, fim);
        }
    }

    private void intercalarDecrescente(int[] vetor, int[] vetorAux, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++)
            vetorAux[k] = vetor[k];

        int i = inicio;
        int m = meio + 1;

        for (int k = inicio; k <= fim; k++) {
            if (i > meio) vetor[k] = vetorAux[m++];
            else if (m > fim) vetor[k] = vetorAux[i++];
            else if (vetorAux[i] > vetorAux[m]) vetor[k] = vetorAux[i++];
            else vetor[k] = vetorAux[m++];
        }
    }

    @Override
    public void ordenar(int[] valores) {
        int[] vetorAux = new int[valores.length];
        setVetorAux(vetorAux);
        setVetor(valores);
        mostrarVetor();
        mergeSortCrescente(valores, getVetorAux(), 0, valores.length - 1);
        System.out.println("vetor Ordenado de forma Crescente: ");
        mostrarVetor();
    }

    @Override
    public void ordenarDecrescente(int[] valores) {
        int[] vetorAux = new int[valores.length];
        setVetorAux(vetorAux);
        setVetor(valores);
        mostrarVetor();
        mergeSortDecrescente(valores, getVetorAux(), 0, valores.length - 1);
        System.out.println("Vetor ordenador de forma Decrescente");
        mostrarVetor();
    }
}



