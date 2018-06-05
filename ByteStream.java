package com.company;

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        File srcFile = new File("/Users/mac/Desktop/a.jpg");
        File destFile = new File("a_copy.jpg");

//        method1(srcFile,destFile);
//        method2(srcFile,destFile)
        method3(srcFile,destFile);
//        method4();
    }

    //基本字节流一次读取一个字节
    public static void method1(File srcFile,File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int i =0;
        while((i = fis.read()) != -1){
            fos.write(i);
        }
        fis.close();
        fos.close();
    }

    //基本字节流一次读取一个字节数组
    public static void method2(File srcFile,File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        byte[] by = new byte[1024];
        int i =0;
        while((i = fis.read(by)) != -1){
            fos.write(by,0,i);
            fos.flush();
        }
        fis.close();
        fos.close();
    }

    //缓冲字节流一次复制一个字节
    public static void method3(File srcFile,File destFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        int i =0;
        while((i = bis.read()) != -1){
            bos.write(i);
        }
        bis.close();
        bos.close();
    }

    //缓冲字节流一次复制一个字节数组
    public static void method4(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] by = new byte[1024];
        int i =0;
        while((i = bis.read(by)) != -1){
            bos.write(by,0,i);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}