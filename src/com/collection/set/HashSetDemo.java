package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> ht = new HashSet<>();
        ht.add(98);
        ht.add(32);
        ht.add(42);
        ht.add(35);
        ht.add(null);
        ht.add(null);
        ht.add(null);
        Iterator<Integer> iterator = ht.stream().iterator();
         while (iterator.hasNext())
          //   iterator.next();
        System.out.println(iterator.next());

    }
}
