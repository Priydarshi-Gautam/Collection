package com.collection.map;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable= new Hashtable<>();
        hashtable.put(101,"AKash");
        hashtable.put(103,"Vikash");
        hashtable.put(102,"Vicky");
        hashtable.put(109,"AKash");
        hashtable.put(5,"Ankita");
        hashtable.keySet().stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
       // for (Map.Entry<Integer,String> hm: hashtable.entrySet().)
      //   System.out.println(hm);
    }
}
