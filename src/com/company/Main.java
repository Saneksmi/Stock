package com.company;


import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        /*создаём магазин1*/
        ArrayListStock shop1 = new ArrayListStock();

        /*закидываем товар на склад магазина1*/
        shop1.putToStock("товар1");
        shop1.putToStock("товар2");
        shop1.putToStock("товар3");

        /*выводим наименование товара в консоль с помощью for-each*/
        for (String s : shop1) {
            System.out.println(s);
        }

        System.out.println(" ");

        /*создаём магазин2*/
        LinkedListStock shop2 = new LinkedListStock();

        /*закидываем товар на склад магазина2*/
        shop2.putToStock("товар4");
        shop2.putToStock("товар5");
        shop2.putToStock("товар6");

        /*выводим наименование товара в консоль с помощью iterator*/
        Iterator<String> iter = shop2.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
