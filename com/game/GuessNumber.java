package com.game;

import java.util.Random;
import java.util.Scanner;

/**
 * 这是猜数字小游戏
 *
 * @author 刘飞
 * @version V1.0
 */
public class GuessNumber {
    private GuessNumber(){

    }

    public static void start(){
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
