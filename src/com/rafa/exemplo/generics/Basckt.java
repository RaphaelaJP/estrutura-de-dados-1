package com.rafa.exemplo.generics;

import java.util.Collection;

public abstract class Basckt<E> {

    public abstract void put(E item);

    public abstract E nextItem();

    public abstract boolean isEmpty();

    public abstract void addAll(Collection<? extends E> collection);

    public abstract void getAll(Collection<? super E> collection);
}
