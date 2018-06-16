package com.company;

import java.awt.*;
import java.awt.event.*;


class Main{
    public static void main(String[] args){
        final Frame f = new Frame("QQ2018");
        f.setLayout(new FlowLayout());
        f.setBounds(333,444,400,333);

        final String name = f.getTitle();
        final Color color = f.getBackground();

        //菜单栏
        MenuBar mb = new MenuBar();
        //菜单
        Menu m = new Menu("设置");
        Menu m2 = new Menu("更改名称");
        Menu m3 = new Menu("更改主题");
        //菜单项
        MenuItem mi1 = new MenuItem("退出");
        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        MenuItem mi2 = new MenuItem("还原默认标题");
        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle(name);
            }
        });

        final MenuItem mi3 = new MenuItem("好好学习");
        mi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle(mi3.getLabel());
            }
        });

        final MenuItem mi4 = new MenuItem("天天向上");
        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle(mi4.getLabel());
            }
        });

        MenuItem mi5 = new MenuItem("原谅绿");
        mi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.GREEN);
            }
        });

        MenuItem mi6 = new MenuItem("珍珠白");
        mi6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.WHITE);
            }
        });

        MenuItem mi7 = new MenuItem("中国红");
        mi7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.RED);
            }
        });

        MenuItem mi8 = new MenuItem("还原默认主题");
        mi8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(color);
            }
        });

        //菜单添加
        m2.add(mi2);
        m2.add(mi3);
        m2.add(mi4);
        m3.add(mi5);
        m3.add(mi6);
        m3.add(mi7);
        m3.add(mi8);
        m.add(m3);
        m.add(m2);
        m.add(mi1);
        mb.add(m);

        //标签与文本框
        Label la = new Label("QQ号：");
        TextField tf = new TextField(40);

        Label la2 = new Label("密码：");
        TextField tf2 = new TextField(40);

        //按钮
        Button bu = new Button("取消");
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Button bu2 = new Button("登录");

        //图标
            //获取工具类对象
        Toolkit tk = Toolkit.getDefaultToolkit();
            //获取图片
        Image i = tk.getImage("/Users/mac/Downloads/qq.ico");
            //设置图标
        f.setIconImage(i);

        //添加
        f.setMenuBar(mb);
        f.add(la);
        f.add(tf);
        f.add(la2);
        f.add(tf2);
        f.add(bu);
        f.add(bu2);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}