package com.company;

import java.io.*;
import java.util.Arrays;

/*
 * 将/Users/mac/Desktop/a.txt中的乱序字符排序后输出到/Users/mac/Desktop/b.txt
 *      分析：
 *          1 读取该文件的内容存储到一个字符串中
 *          2 将此字符串转换成一个字符数组
 *          3 对此数组进行排序
 *          4 将此数组转换成字符串
 *          5 将此字符串写入b.txt
 */
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/mac/Desktop/a.txt"));
        String line = br.readLine();
        br.close();

        char[] chs = line.toCharArray();

        Arrays.sort(chs);

        String newLine = new String(chs);

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/mac/Desktop/b.txt"));
        bw.write(newLine);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}