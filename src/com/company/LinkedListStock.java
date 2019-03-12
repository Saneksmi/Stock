package com.company;

import java.util.LinkedList;
import java.util.Iterator;

/*Класс Stock для хранения товара с реализацией интерфейса Iterable и Iterator с использованием LinkedList*/
public class LinkedListStock implements Iterable<String>, Iterator<String> {

    private LinkedList<String> items;
    private int currentIndex;

    public LinkedListStock() {
        this.items = new LinkedList<>();
    }

    /*метод для помещения товара на склад магазина*/
    public void putToStock(String s) {
        items.add(s);
    }

    @Override
    public Iterator<String> iterator() {
        return this;
    }

    /*здесь просто переопределяем hasNext() и next(), а в метод iterator() возвращаем this*/
    @Override
    public boolean hasNext() {
        return currentIndex < items.size() && items.get(currentIndex) != null;
    }

    @Override
    public String next() {
        return items.get(currentIndex++);
    }

}