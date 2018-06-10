package com.company;
/*
 * 实现多线程
 *      方式二：
 *          1 自定义MyRunnable类实现Runnable接口
 *          2 重写run()方法
 *          3 创建MyRunnable类的对象
 *          4 创建Thread类的对象，并把3步骤的对象当作构造参数传递
 */
public class Main {

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr,"古力娜扎");
        Thread t2 = new Thread(mr,"杨幂");

        t1.start();
        t2.start();
    }
}
