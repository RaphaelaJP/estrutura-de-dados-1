package com.rafa.exemplo.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import static java.lang.Math.abs;

public class ListaBasckt <E> extends Basckt<E>{

    private List<E> list;

    public ListaBasckt() {
        list = new ArrayList<>();
    }

    @Override
    public void put(E item) {
        list.add(item);

    }

    @Override
    public E nextItem() {
        Random gerar = new Random(System.currentTimeMillis());
        int index = abs(gerar.nextInt()) % (list.size());
        return list.remove(index);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void addAll(Collection<? extends E> collection) {
        for(E item : collection){
            put(item);
        }
    }

    @Override
    public void getAll(Collection<? super E> collection) {
        while (!isEmpty()){
            collection.add(nextItem());
        }
    }
}
