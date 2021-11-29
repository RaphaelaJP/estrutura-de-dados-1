package br.com.rafa.algoritmoOrd.InsertionSort;

/**
 *
 * @author rafaela.passos
 */
public class TesteInsertionSort {

    public static void main(String[] args) {
        
        InsertionSort valor = new InsertionSort(5);
        valor.mostrarVetor();
        System.out.println("============= // ================  ");
        
        
        System.out.println("Vetor Ordenado: ");
        valor.insertionSort();
        
    }
    
}
