package com.lpjavacollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doListDemo();
    }

    private static void doListDemo() {
        System.out.println("Demo List Contains");
        List<String> list = new LinkedList<>();

        list.add("Nishu");
        list.add("Kajal");
        list.add("Shreya");
        list.add("Priya");
        list.add("Yukti");

        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}