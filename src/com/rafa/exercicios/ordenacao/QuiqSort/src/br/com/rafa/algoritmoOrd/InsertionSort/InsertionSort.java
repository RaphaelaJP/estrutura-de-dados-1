package br.com.rafa.algoritmoOrd.InsertionSort;

/**
 *
 * @author rafaela.passos
 */

import java.util.Random;

public class InsertionSort {
    private int[] vetor;
    
  public InsertionSort(int tamanho){
      gerarVetor(tamanho);
  }

    private int[] gerarVetor(int tamanho) {
        vetor = new int [tamanho];
        Random gerador =  new Random();
        
        for(int i = 0; i < tamanho; i++){
            vetor[i] = gerador.nextInt(100);
        }
        System.out.println("Números do vetor: ");
        return vetor;  
    }
    
    int aux, j;
    public void insertionSort(){
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        mostrarVetor();
    }
    
    public void mostrarVetor(){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O valor no indice " + i + "º é: " + vetor[i]);
        }
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }  
}
