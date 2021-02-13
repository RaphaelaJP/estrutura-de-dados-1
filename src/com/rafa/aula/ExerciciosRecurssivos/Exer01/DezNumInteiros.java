package com.rafa.aula.ExerciciosRecurssivos.Exer01;

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

    //Forma iterativa
    public void MostrarValor() {
        for (int i = 1; i <= 10; i++) {
            num = i;
            System.out.println(num);
        }
    }

    //Forma recurssiva
    public int MostrarValorRecurssivo(int num){
        if (num == 10){
            return 10;
        }
        System.out.println(num);
        return MostrarValorRecurssivo(num+1);
    }
}
