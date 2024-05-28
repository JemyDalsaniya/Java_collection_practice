package com.spring;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(20);
        adq.offerFirst(21);
        adq.offerLast(22);
        adq.offer(23);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() : " +adq);

        System.out.println(adq.pollFirst());
        System.out.println("poll First() : " +adq);
        System.out.println(adq.pollLast());
        System.out.println("poll Last() : " +adq);

    }
}
