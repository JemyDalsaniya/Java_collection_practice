package com.spring;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
//        Map<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.putIfAbsent("Two", 23);
        System.out.println(numbers);

        if (!numbers.containsKey("One")) {
            numbers.put("One", 11);
        }

        System.out.println(numbers.containsValue(3));

        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (String key : numbers.keySet()) {
            System.out.println(key);
        }
        for (Integer value : numbers.values()) {
            System.out.println(value);
        }

        System.out.println(numbers.containsValue(3));


    }
}
