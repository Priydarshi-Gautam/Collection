package com.collection.map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(101,"Akash");
        treeMap.put(103,"Rahul");
        treeMap.put(105,"Ravi");
        treeMap.put(104,"Ram");
        treeMap.put(0,"Ravi");
        treeMap.put(27,"");

        System.out.println(treeMap);
        System.out.println(treeMap.get(0));
    }
}
