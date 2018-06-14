package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Main{
    public static void main(String[] args){
        //创建窗体对象
        Frame f = new Frame("一个小窗口儿");
        //设置窗体位置和宽度高度
        f.setBounds(450,550,450,350);
        //设置布局
        f.setLayout(new FlowLayout());

        //创建按钮对象
        Button b = new Button("我是按钮！！！");
        Button b2 = new Button("我是另一个按钮");
        b.setSize(10,20);
        b.setSize(20,25);

        //设置按钮事件
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("再点一个试试");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你还真点");
            }
        });

        //将按钮放入窗体
        f.add(b);
        f.add(b2);

        //设置窗体可关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //显示窗口
        f.setVisible(true);

    }
}