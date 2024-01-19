package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Name");
        hashMap.put(3,"Age");
        hashMap.put(5,"Email");
        hashMap.put(4,"Name");

        // we can retrieve data from 2 ways

        // 1 -> using of entrySet and iterator
        // 2 -> using of Map.Entry

        // 1st way

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while ((iterator.hasNext()))
        {

            Map.Entry m =(Map.Entry) iterator.next();
            // = iterator.next();
            System.out.println(m.getKey());
        }




          // Map.Entry hm = (Map.Entry) hashMap.entrySet();
            //System.out.println(hm.getKey());

        //  2nd Way

     for (Map.Entry hm : hashMap.entrySet())
     {
         System.out.println(hm.getKey()+" "+ hm.getValue());
     }
    }
}
