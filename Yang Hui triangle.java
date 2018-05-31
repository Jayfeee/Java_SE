package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //这个n的数据来自键盘键入
        System.out.println("请输入一个数据：");
        int n = sc.nextInt();

        //定义一个动态二维数组
        int [][]arr = new int [n][n];

        //给这个数组任何一行头元素和尾元素赋值1
        for(int x=0; x<arr.length; x++){
            arr[x][0] = 1;
            arr[x][x] = 1;
        }

        for(int x=0; x<arr.length; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------");

        //给内部元素赋值
            for (int x = 2; x < arr.length; x++) {
                for (int y = 1; y < x; y++) {
                    arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
                }
            }
            //遍历此数组
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y <= x; y++) {
                    System.out.print(arr[x][y] + "\t");
                }
                System.out.println();
            }
    }
}
