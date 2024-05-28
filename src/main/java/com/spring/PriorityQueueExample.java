package com.spring;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        try {

//            Queue<Integer> priorityQueue = new PriorityQueue<>();
            Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

            priorityQueue.offer(40);
            priorityQueue.offer(12);
            priorityQueue.offer(24);
            priorityQueue.offer(36); //returns true or false
            System.out.println(priorityQueue);
            priorityQueue.poll();
            System.out.println(priorityQueue);
            System.out.println(priorityQueue.peek());

//            System.out.println(priorityQueue.peek()); //works same as element but if priorityQueue is empty then it will returns null
//
//            priorityQueue.add((int) 10.20); //works same as offer  but if task not successful then it will throw exception
//            priorityQueue.element(); //works same as peek but if priorityQueue is empty then it will throw exception
//            priorityQueue.remove(); //works same as poll but if priorityQueue is empty then it will throw exception
          




        }catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}
