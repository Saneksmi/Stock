package com.company;


import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayListStock shop1 = new ArrayListStock();
        shop1.putToStock("товар1");
        shop1.putToStock("товар2");
        shop1.putToStock("товар3");

        for (String s : shop1)
        {
            System.out.println(s);
        }

        System.out.println(" ");

        LinkedListStock shop2 = new LinkedListStock();
        shop2.putToStock("товар4");
        shop2.putToStock("товар5");
        shop2.putToStock("товар6");

        Iterator<String> iter = shop2.iterator();

        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }



    }


}
