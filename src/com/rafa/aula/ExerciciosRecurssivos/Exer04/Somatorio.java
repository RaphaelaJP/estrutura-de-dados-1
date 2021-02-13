package com.rafa.aula.ExerciciosRecurssivos.Exer04;

public class Somatorio {
    private int numero;

    public Somatorio() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int somatorioRecurssivo(int numero){
        if (numero == 0){
            return 0;
        }
        return numero + somatorioRecurssivo(numero -1);
    }
}
