package com.company;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListStock implements Iterable<String>, Iterator<String> {

    private LinkedList<String> items;
    private int currentIndex;

    public LinkedListStock() {
        this.items = new LinkedList<>();
    }

    public void putToStock(String s) {
        items.add(s);

    }

    @Override
    public Iterator<String> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < items.size() && items.get(currentIndex) != null;
    }

    @Override
    public String next() {
        return items.get(currentIndex++);
    }

}