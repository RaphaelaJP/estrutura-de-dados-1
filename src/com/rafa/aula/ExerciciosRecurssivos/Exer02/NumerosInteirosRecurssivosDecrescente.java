package com.rafa.aula.ExerciciosRecurssivos.Exer02;

public class NumerosInteirosRecurssivosDecrescente {
    private int num;

    public NumerosInteirosRecurssivosDecrescente() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int MostrarValorRecurssivoDecrescente(int num){
        if (num == 0){
            return 0;
        }
        System.out.println(num);
        return MostrarValorRecurssivoDecrescente(num-1);
    }
}
