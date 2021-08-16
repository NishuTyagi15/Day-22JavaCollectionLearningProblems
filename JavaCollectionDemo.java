package com.lpjavacollection;

import java.util.HashMap;
import java.util.Map;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doMapDemo();
    }

    private static void doMapDemo() {
        System.out.println("Demo Map Contains");
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"Nishu");
        map.put(101,"Krati");
        map.put(102,"Yukti");
        map.put(102,"Yukti");

        for(Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}