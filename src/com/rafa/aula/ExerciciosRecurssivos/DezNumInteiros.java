package com.rafa.aula.ExerciciosRecurssivos;

public class DezNumInteiros {

    private int num;

    public DezNumInteiros() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void MostrarValor() {
        for (int i = 1; i <= 10; i++) {
            num = i;
            System.out.println(num);
        }
    }

    public int MostrarValorRecurssivo(int num){
        if (num == 10){
            return 10;
        }
        System.out.println(num);
        return MostrarValorRecurssivo(num+1);
    }

    public int MostrarValorRecurssivoDecrescente(int num){
        if (num == 1){
            return 1;
        }
        System.out.println(num);
        return MostrarValorRecurssivoDecrescente(num-1);
    }
}
