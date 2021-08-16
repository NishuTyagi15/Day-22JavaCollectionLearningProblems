package com.lpjavacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doListDemo();
    }

    private static void doListDemo() {
        System.out.println("Demo List Contains");
        //Creating List
        List<String> list = new ArrayList<>();

        //Adding objects to the List
        list.add("Nishu");
        list.add("Kajal");
        list.add("Shreya");
        list.add("Priya");
        list.add("Nishu");

        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}