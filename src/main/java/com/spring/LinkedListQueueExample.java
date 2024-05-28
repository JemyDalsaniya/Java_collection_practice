package com.spring;

import java.util.*;

public class LinkedListQueueExample {

    public static void main(String[] args) {

        try {

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(10);
            queue.offer(20);
            queue.offer(30); //returns true or false
            System.out.println(queue);
            queue.poll();
            System.out.println(queue);
            System.out.println(queue.peek()); //works same as element but if queue is empty then it will returns null

            queue.add((int) 10.20); //works same as offer  but if task not successful then it will throw exception
            queue.element(); //works same as peek but if queue is empty then it will throw exception
            queue.remove(); //works same as poll but if queue is empty then it will throw exception





        }catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}
