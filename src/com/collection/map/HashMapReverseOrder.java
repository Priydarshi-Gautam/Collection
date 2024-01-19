package com.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapReverseOrder {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Name");
        hashMap.put(3, "Age");
        hashMap.put(5, "Email");
        hashMap.put(4, "Name");
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
