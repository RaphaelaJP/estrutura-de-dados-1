package com.rafa.exercicios.ordenacao.MergeSort.Test;

import com.rafa.exercicios.ordenacao.MergeSort.MergrSort;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;


class MergrSortTest {
    MergrSort merge;

    @Test
    void ordenarVetorInteiro() {
        int[] vetor = {8, 6, 4, 5};
        int[] vetResul = {4, 5, 6, 8};
        merge = new MergrSort();
        merge.ordenar(vetor);
        assertArrayEquals(vetResul, vetor);
    }

    @Test
    void ordenarDecrescenteVetorInteiro() {
        int[] vetor = {8, 6, 2, 4, 1, 7};
        int[] vetResul = {8, 7, 6, 4, 2, 1};
        merge = new MergrSort();
        merge.ordenarDecrescente(vetor);
        assertArrayEquals(vetResul, vetor);
    }

    @Test
    void qtdElePares() {
        int[] vetor = {0, 4, 8, 2, 6};
        int[] vetResul = {0, 2, 4, 6, 8};
        merge = new MergrSort();
        merge.ordenar(vetor);
        assertArrayEquals(vetResul, vetor);
    }

    @Test
    void qtdEleImpares() {
        int[] vetor = {5, 3, 9, 7, 1};
        int[] vetResul = {1, 3, 5, 7, 9};
        merge = new MergrSort();
        merge.ordenar(vetor);
        assertArrayEquals(vetResul, vetor);
    }

    @Test
    void PosIgualUm() {
        int[] vetor = {9}, vetResul = {9};
        merge = new MergrSort();
        merge.ordenar(vetor);
        assertArrayEquals(vetResul, vetor);
    }

    @Test
    void aleatorioSemRepetirCrescente() {
       int[] vetor = {8,5,6,1,2};
       int[] vetResul = {1,2,5,6,8};
       merge = new MergrSort();
       merge.ordenar(vetor);
       assertArrayEquals(vetResul, vetor);
    }

    @Test
    void aleatorioSemRepetirDecrescente() {
        int[] vetor = {9,5,7,6,3,4};
        int[] vetResul = {9,7,6,5,4,3};
        merge = new MergrSort();
        merge.ordenarDecrescente(vetor);
        assertArrayEquals(vetResul, vetor);
    }

    @Test
    void aleatorioComRepetirCrescente() {
        int[] vetor = {7,5,3,6,5,7};
        int[] vetResul = {3,5,5,6,7,7};
        merge = new MergrSort();
        merge.ordenar(vetor);
        assertArrayEquals(vetResul, vetor);
    }

    @Test
    void aleatorioComRepetirDecrescente() {
        int[] vetor = {2,9,6,8,5,2,9};
        int[] vetResul = {9,9,8,6,5,2,2};
        merge = new MergrSort();
        merge.ordenarDecrescente(vetor);
        assertArrayEquals(vetResul, vetor);
    }
}