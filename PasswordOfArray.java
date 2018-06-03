/*  题目要求：
        A：数据是小于10的一个整数
        B：加密规则
            a：首先将数据倒序
            b：然后把每个数据加上5，再用和除于10的余数代替该数字
            c：最后将第一位和最后一位数字交换
        C：把加密后的结果输出在控制台

        拓展
            a：用方法改进
            b：从键盘获取元素

    难点：
        a：将int型数据转为数组
        b：将加密后数组内的内容返回主函数
*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数据(小于10位)：");
        int number = sc.nextInt();

        String s = jiaMi(number);
        System.out.println("加密后的结果为："+s);
    }




    public static String jiaMi(int number){
        int []arr = new int[10];
        int index = 0;

        while(number > 0){
            arr[index] = number % 10;
            index++;
            number = number / 10;
        }

        for(int x=0; x<index; x++){
            arr[x] = (arr[x] + 5)%10;
        }

        int tempt = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = tempt;

        String s = "";

        for(int x=0; x<index; x++){
            s = s + arr[x];
        }
        return s;
    }
}
