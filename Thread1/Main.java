package com.company;
/*
 * 实现多线程：
 *      方式一：
 *          1 自定义MyThread类继承Thread类
 *          2 重写run()方法
 *          3 创建MyThread类的对象
 *          4 调用start()方法，启动线程对象
 *
 *          问题：
 *              1 为什么要重写run()方法？
 *                  因为run()里面封装的是被线程执行的代码
 *              2 run()和start()方法的区别？
 *                  使用run()直接调用仅仅是普通方法
 *                  调用start()会先启动线程，再由JVM调用start()方法
 */
class Main{
    public static void main(String[] arsg){
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("古力娜扎");
        mt2.setName("杨幂");

        mt1.start();
        mt2.start();
    }
}