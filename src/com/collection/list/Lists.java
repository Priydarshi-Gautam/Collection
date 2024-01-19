package com.collection.list;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Akash");
        list.add("Viki");
        list.add("Suresh");
        list.add("Yogesh");
        list.add("Yogesh");
        list.add("Chandan");


        System.out.println(list.get(2));
        list.addFirst("this");
        System.out.println(list);

        System.out.println(list.indexOf("Viki"));

        Vector<String> vector = new Vector<>(list);
        System.out.println("vector "+ vector);

        System.out.println("+++++++++++++++++++++++++++++ iterator method");

        Iterator<String> iterator1 = list.iterator();
            while (iterator1.hasNext())
            {
                String next = iterator1.next();
                System.out.println(next);
            }

        System.out.println("------------------------------- list-iterator");

        ListIterator<String> str = list.listIterator();
        while (str.hasPrevious())
        {
            String next2 = str.previous();
            System.out.println(next2);
        }

    }
}
