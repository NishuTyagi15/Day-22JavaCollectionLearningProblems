package com.lpjavacollection;

import java.util.*;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doListDemo();
        doStackDemo();
        doQueueDemo();
        doSetDemo();
        doMapDemo();
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

    private static void doStackDemo() {
        System.out.println("\nDemo Stack Contains");
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

    private static void doQueueDemo() {
        System.out.println("\nDemo Deque Contains");
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Nishu Tyagi");
        queue.add("Kajal Sharma");
        queue.add("Shreya Singh");
        queue.add("Priya Tiwari");
        queue.add("Neha Mishra");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("\nIterating the Queue Elements");
        Iterator itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("\nAfter Removing Two Elements");
        Iterator itr1 = queue.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }

    private static void doSetDemo() {
        System.out.println("\nDemo Set Contains");
        Set<String> set = new LinkedHashSet<>();
        set.add("Nishu");
        set.add("Shreya");
        set.add("Priya");
        set.add("Neha");
        for (String str :set) {
            System.out.println(str);
        }
    }

    private static void doMapDemo() {
        System.out.println("\nDemo Map Contains");
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