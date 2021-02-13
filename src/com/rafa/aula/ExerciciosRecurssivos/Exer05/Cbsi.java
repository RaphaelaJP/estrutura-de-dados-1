package com.rafa.aula.ExerciciosRecurssivos.Exer05;

public class Cbsi extends GenSuperior {

    private int qtdAlunos;

    public Cbsi() {
        this.qtdAlunos = 10;
    }

    @Override
    public int getQtdAlunos() {
        return qtdAlunos;
    }

    @Override
    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    @Override
    public int calcularQtdAlunos() {
        return super.calcularQtdAlunos();
    }
}
