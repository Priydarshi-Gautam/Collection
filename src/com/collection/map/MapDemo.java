package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map= new HashMap();
        map.put("name","Akash");
        map.put("age",25);
        map.put("age",25);
        map.put("gender","male");
        map.put("","");
        map.put(0,"k");
        map.put(null,null);
        map.put(null,null);   // it will replace value
        map.put(null,"abc");
        map.put(1,"student");



        System.out.println(map);

    }
}
