package com.learn.collection;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("10");
        queue.add("Kanha");
        System.out.println(queue);
        queue.offer("Hielo");
        System.out.println(queue);
        System.out.println(queue.element());

        Queue<Integer> arrayQueue = new ArrayDeque<>();


    }
}
