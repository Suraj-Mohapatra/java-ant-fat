package com.uglyeagle;

import com.uglyeagle.greet.Greeting;

public class Main {
    public static void main(String[] args) {
        String message = Greeting.greet();
        System.out.println(message);
        Greeting.foo();
    }
    
}