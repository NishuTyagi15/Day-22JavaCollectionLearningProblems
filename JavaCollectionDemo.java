package com.lpjavacollection;

import java.util.Iterator;
import java.util.Stack;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doStackDemo();
    }

    private static void doStackDemo() {
        System.out.println("Demo Stack Contains");
        Stack<String> stack = new Stack<>();
        stack.push("Nishu");
        stack.push("Kajal");
        stack.push("Shreya");
        stack.push("Priya");
        stack.push("Yukti");
        stack.push("Neha");
        String pop = stack.pop();
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}