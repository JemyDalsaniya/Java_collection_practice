package com.spring;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        try {

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list);
            list.add(4); //add element at the end
            System.out.println(list);
            list.add(1, 5); // add element at the specified index
            System.out.println(list);

            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(100);
            newList.add(101);
            list.addAll(newList);
            System.out.println(list);
            System.out.println(list.get(2));
            //System.out.println(list.remove(2)); // remove from index
            //System.out.println(list.remove(Integer.valueOf(3))); // remove specific element
            System.out.println(list);

           // list.clear(); //remove all elements
            list.set(2,1000);
            System.out.println(list);

            for (int i = 0; i < list.size(); i++) {
                System.out.println("element is :" +list.get(i));
            }

            for (Integer i : list) {
                System.out.println("for each : "+i);
            }

            Iterator<Integer> it = list.iterator();

            while (it.hasNext()) {
                System.out.println("element is :" + it.next());
            }



        }catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}
