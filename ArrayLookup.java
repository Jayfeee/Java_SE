package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr[x].length; y++){
                System.out.println(arr[x][y ]);
            }
        }
    }
}

