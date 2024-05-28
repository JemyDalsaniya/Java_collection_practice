package com.spring;


import java.util.ArrayList;
import java.util.List;

//@FunctionalInterface
interface A {
    private void show() {
        System.out.println("hello");
    }
//    void show2();
//    void show3();
}

interface B {

    default int show() {
        return  10;
    }
}


public class FunctionalInterfaceDemo implements A{
    public static void main(String[] args) {
        FunctionalInterfaceDemo obj = new FunctionalInterfaceDemo();
        
    }
}
