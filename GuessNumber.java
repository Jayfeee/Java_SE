package com.company;

import java.util.Random;
import java.util.Scanner;

import java.io.*;
import java.util.Properties;

class Main{
    public static void main(String[] args) throws IOException {
        //读档，获取已玩次数
        Properties prop = new Properties();
        Reader r = new FileReader("count.txt");
        prop.load(r);
        r.close();
        //将Properties中的的次数由字符串转换成整形
        String s = prop.getProperty("count");
        int count = Integer.parseInt(s);

        if(count < 5){
            count++;
            prop.setProperty("count",String.valueOf(count));
            Writer w = new FileWriter("count.txt");
            prop.store(w,"游戏计数");

            start();
        }else {
            System.out.println("试玩已结束，请付费后进行更畅快的游戏体验！");
        }
    }

    public void start(){
        Random r = new Random();
        int rNumber = r.nextInt(100)+1;

        int count = 0;
        //获取开始时间
        long startTime = System.currentTimeMillis();

        while(true) {
            System.out.println("请输入你要猜的数字（1-100）：");
            Scanner sc = new Scanner(System.in);
            count++;
            int guessNumber = sc.nextInt();
            if (guessNumber > rNumber) {
                System.out.println("你猜大了，请重新输入");
            } else if (guessNumber < rNumber) {
                System.out.println("你猜小了，请重新输入");
            } else {
                //获取结束时间
                long endTime = System.currentTimeMillis();
                long time = (endTime - startTime)/1000;
                System.out.println("恭喜你！猜对了！！");
                System.out.println("共猜"+count+"次");
                System.out.println("共耗时"+time+"秒");
                break;
            }
        }
    }
}