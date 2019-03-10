package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStock implements Iterable<String> {

    private ArrayList<String> items;
    private int currentIndex;

    public ArrayListStock() {
        this.items = new ArrayList<>();
    }

    public void putToStock(String s) {
        items.add(s);
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            return currentIndex < items.size() && items.get(currentIndex) != null;
        }

        @Override
        public String next() {
            return items.get(currentIndex++);
        }

    }
}
