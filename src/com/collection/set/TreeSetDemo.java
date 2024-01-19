package com.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(12);
        tree.add(32);
      //  tree.add(2);
        tree.add(8);
        tree.add(2);
     //    tree.add(null);    // we cant add null

        System.out.println(tree);



    }
}
