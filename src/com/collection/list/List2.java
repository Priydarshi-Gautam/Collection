package com.collection.list;

import java.util.*;

public class List2 {
    public static void main(String[] args) {

        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(4);
        set.add(7);
        set.add(5);
        System.out.println(set);

        // iterator methods (forward method)

 //        for (Integer next : set) {
//            System.out.println(next);
//        }

        ListIterator<Integer> itr = set.listIterator(set.size());

        while (itr.hasPrevious())
        {
            Integer previous = itr.previous();

            System.out.println(previous);
        }
    }
}
