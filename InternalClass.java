package com.company;

interface Inter{
    public abstract void show();
    public abstract void show2();
}

class Outer{
    private int a = 10;
    public void method(){
        //一个方法的时候
        /*
        new Inter(){
            public void show(){
                System.out.println(1234);
            }.show();
        }
        */

        //多个方法的时候
        Inter i = new Inter(){
            public void show(){
                System.out.println(888);
            }

            public void show2(){
                System.out.println(666);
            }
        };
        i.show();
        i.show2();
    }
}

class Main{
    public static void main(String[] args){
        Outer o = new Outer();
        o.method();
    }
}