package com.spring;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Jemy", 1));
        studentSet.add(new Student("Brijesh", 2));
        studentSet.add(new Student("Jaydeep", 3));
        studentSet.add(new Student("Niva", 4));
        System.out.println(studentSet);

//        Set<Integer> set = new HashSet<Integer>(); // it will be in any order
//        Set<Integer> set = new LinkedHashSet<>(); //it will print the elements in the creation order
        Set<Integer> set = new TreeSet<>(); //it will print the elements in the sorted form used binary search inside
        set.add(32);
        set.add(11);
        set.add(3);
        set.add(15);
        set.add(28);
        set.add(54);

        System.out.println(set);
        set.remove(15);
        System.out.println(set);
        System.out.println(set.contains(54));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
