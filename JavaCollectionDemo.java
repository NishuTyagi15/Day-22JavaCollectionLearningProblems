package com.lpjavacollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class JavaCollectionDemo {
    public static void main(String[] args) {
        doQueueDemo();
    }

    private static void doQueueDemo() {
        System.out.println("Demo Deque Contains");
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Nishu Tyagi");
        queue.add("Kajal Sharma");
        queue.add("Shreya Singh");
        queue.add("Priya Tiwari");
        queue.add("Neha Mishra");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("Iterating the Queue Elements");
        Iterator itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After Removing Two Elements");
        Iterator itr1 = queue.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}