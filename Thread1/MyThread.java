package com.company;

public class MyThread extends Thread {
    public void run(){
        for(int x = 1; x <= 100; x++){
            System.out.println(getName()+":"+x);
        }
    }
}
