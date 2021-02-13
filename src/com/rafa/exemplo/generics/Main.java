package com.rafa.exemplo.generics;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Basckt<Fruit> basckt = new ListaBasckt<>();
        basckt.put(new Fruit("Goiaba"));
        basckt.put(new Fruit("Mamão"));
        basckt.put(new TropicalFruit("Banana"));
        basckt.put(new Fruit("Laranja"));
        basckt.put(new Fruit("Uva"));
        basckt.put(new Fruit("Abacaxi"));
        basckt.put(new Fruit("Melão"));
        basckt.put(new TropicalFruit("Maracuja"));

        Set<TropicalFruit> set = new HashSet<>();

        set.add(new TropicalFruit("Cupuaçu"));
        set.add(new TropicalFruit("Açai"));
        set.add(new TropicalFruit("Bacuri"));

        basckt.addAll(set);

        Set<Vegetal> veg =  new HashSet<>();

        System.out.println("Tire 5 da cesta:");
        for (int i = 0; i < 5; i++){
            System.out.println(basckt.nextItem());
        }
        System.out.println("------------");
        basckt.getAll(veg);
        System.out.print(veg);
    }
}