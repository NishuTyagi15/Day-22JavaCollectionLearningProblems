package com.lpjavacollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doSetDemo();
    }

    private static void doSetDemo() {
        System.out.println("Demo Set Contains");
        Set<String> set = new LinkedHashSet<>();
        set.add("Nishu");
        set.add("Shreya");
        set.add("Priya");
        set.add("Neha");
        for (String str :set) {
            System.out.println(str);
        }
    }
}