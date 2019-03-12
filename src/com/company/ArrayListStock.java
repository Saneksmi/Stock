package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/*Класс Stock для хранения товара с реализацией интерфейса Iterable с использованием ArrayList*/
public class ArrayListStock implements Iterable<String> {

    private ArrayList<String> items;
    private int currentIndex;

    public ArrayListStock() {
        this.items = new ArrayList<>();
    }

    /*метод для помещения товара на склад магазина*/
    public void putToStock(String s) {
        items.add(s);
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    /*Создаём отдельный класс, реализуем интерфейс Итератор и возвращаем объект в метод iterator()*/
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
