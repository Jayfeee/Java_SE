package com.company;

import java.util.Scanner;
class MyMath{

    public void add(int a,int b){
        int add = a + b;
        System.out.println("加法结果："+add);
    }

    public void sub(int a,int b){
        int sub = a - b;
        System.out.println("减法结果："+sub);
    }

    public void mul(int a,int b){
        int mul = a * b;
        System.out.println("乘法结果："+mul);
    }

    public void div(int a,int b){
        int div = a / b;
        System.out.println("除法结果："+div);
    }
}

class Calculator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        MyMath mm = new MyMath();

        mm.add(a,b);
        mm.sub(a,b);
        mm.mul(a,b);
        mm.div(a,b);
    }
}