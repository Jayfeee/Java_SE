package com.company;

public class Main {

    public static void main(String[] args) {
        int[]arr = {23, 23, 3, 434, 34, 23, 34, 345, 323};
        int[]arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[]arr3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[][]arr4 = {{1,2,3},{4,5,6},{7,8,9}};

        printArr3(arr4);

    }




    //打印数组
    public static void printArr(int[] arr) {
        System.out.println("打印数组");

        for(int x = 0; x < arr.length; ++x) {
            System.out.println(arr[x]);
        }

    }
    //打印数组改进版
    public static void printArr2(int[] arr) {
        System.out.println("改进版打印数组");
        System.out.print("[ ");

        for(int x = 0; x < arr.length; ++x) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + " , ");
            }
        }

        System.out.println(" ]");
    }
    //打印二维数组
    public static void printArr3(int[][] arr){
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr[x].length; y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
    //逆序排列数组
    public static void reverse(int[] arr) {
        System.out.println("逆序排列数组");

        for(int x = 0; x < arr.length / 2; ++x) {
            int temp = arr[x];
            arr[x] = arr[arr.length - 1 - x];
            arr[arr.length - 1 - x] = temp;
        }

    }
    //逆序排列数组改进版
    public static void reverse2(int [] arr){
        for(int start=0,end=arr.length-1;start <= end;start++,end--){
            int tempt = arr[start];
                arr[start] = arr[end];
                arr[end] = tempt;
        }
    }
    //获取数组最大数
    public static void getMax(int[] arr) {
        System.out.println("获取数组最大值");
        int max = arr[0];

        for(int x = 0; x < arr.length; ++x) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }

        System.out.println("此数组中的最大值为：" + max);
        System.out.println("数组长度为：" + arr.length);
        System.out.println("--------------");
    }
    //获取数组最小数
    public static void getMin(int[] arr) {
        System.out.println("获取数组最小值");
        int min = arr[0];

        for(int x = 0; x < arr.length; ++x) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }

        System.out.println("此数组中的最小值为：" + min);
        System.out.println("数组长度为：" + arr.length);
        System.out.println("--------------");
    }

}


