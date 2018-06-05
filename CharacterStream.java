package com.company;

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        String srcString = "/Users/mac/Desktop/NBA.txt";
        String destString = "NBA_Copy.txt";

        method1(srcString,destString);
//        method2(srcString,destString);
//        method3(srcString,destString);
//        method4(srcString,destString);
//        method5(srcString,destString);
    }
    //基本字符流一次写一个字符
    public static void method1(String srcString,String destString) throws IOException {
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);

        int i =0;
        while((i = fr.read()) != -1){
            fw.write(i);
        }
        fr.close();
        fw.close();
    }
    //基本字符流一次写一个数组
    public static void method2(String srcString, String destString) throws IOException{
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);

        char[] chs = new char[1024];
        int i =0;
        while((i = fr.read(chs)) != -1){
            fw.write(chs,0,i);
        }
        fr.close();
        fw.close();
    }
    //缓冲字符流一次写一个字符
    public static void method3(String srcString, String destString) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

        int i =0;
        while((i = br.read()) != -1){
            bw.write(i);
        }
        br.close();
        bw.close();
    }
    //缓冲字符流一次写一个字符数组
    public static void method4(String srcString, String destString) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

        char[] chs = new char[1024];
        int i =0;
        while((i = br.read(chs)) != -1){
            bw.write(chs,0,i);
        }
        br.close();
        bw.close();
    }
    //缓冲字符流一次写一行字符
    public static void method5(String srcString, String destString) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

        String line = null;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }


}