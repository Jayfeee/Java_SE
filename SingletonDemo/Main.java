package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = Person.getPerson();
        Person p2 = Person.getPerson();

        System.out.println(p1 == p2);
    }
}
