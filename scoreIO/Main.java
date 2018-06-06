package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入五个学生信息及成绩，并按照总分从高到低输出到文本文件
 *
 *  分析：
 *      1 创建学生类
 *      2 创建集合
 *      3 键盘录入信息存储到集合
 *      4 遍历集合将数据输出到文本文件
 */
class Main{
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //主要条件
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num==0 ? s2.getChinese() - s1.getChinese() : num;
                int num3 = num2==0 ? s2.getMath() - s1.getMath() : num2;
                int num4 = num3==0 ? s2.getChinese() - s1.getEnglish() : num3;
                int num5 = num4==0 ? s2.getName().compareTo(s1.getName()) : num4;

                return num5;
            }
        });
        //输入学生总数
        Scanner num = new Scanner(System.in);
        System.out.println("共几名学生：");
        int i = num.nextInt();
        //往TreeSet集合中填入学生信息
        for(int x =1; x<=i; x++){
            Scanner sc = new Scanner(System.in);

            System.out.println("***学生姓名***\r");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            Student s = new Student(name,chinese,math,english);
            ts.add(s);
        }

        //将学生信息输出到文本文件
        output(ts);
    }

    public static void output(TreeSet<Student> ts) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("期末考试高一(2)班成绩表.txt"));

        for(Student s: ts){
            bw.write("姓名："+s.getName()+"\n");
            bw.write("语文："+s.getChinese()+"\n");
            bw.write("数学："+s.getMath()+"\n");
            bw.write("英语："+s.getEnglish()+"\n");
            bw.write("---总分："+s.getSum());
            bw.newLine();
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}