package com.uglyeagle.greet;


import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Greeting {
    
    public static String greet(){
        return "Hello! Welcome you to java-ant-fat";
    }
    
    public static void foo(){
        MultiValuedMap<String, String> multiMap = new ArrayListValuedHashMap<>();

        multiMap.put("first name", "John");
        multiMap.put("middle name", "Michael");
        multiMap.put("surname", "Doe");

        for (String key : multiMap.keySet()) { // iterates over the set of keys of multiMap
            System.out.print(multiMap.get(key)+" ");
        }
        System.out.println("\nthe order is not guaranteed here");
    }
    
}