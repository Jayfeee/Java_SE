package com.company;

public class Person {
    private Person(){

    }

    private static Person p = null;

    public synchronized static Person getPerson(){
        if(p == null){
            return new Person();
        }
        return p;
    }
}
