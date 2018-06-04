package com;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.game.GuessNumber;
import com.pojo.User;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            System.out.println("----------------欢迎使用----------------");
            System.out.println("1  登录");
            System.out.println("2  注册");
            System.out.println("3  退出");
            System.out.println("4  test");

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            //将用户实现类的对象创建在外面供里面各个功能调用
            UserDao ud = new UserDaoImpl();
            switch (choice) {
                case "1":
                    //登录功能: 输入
                    System.out.println("----------------登录----------------");
                    System.out.println("用户名：");
                    String userName = sc.nextLine();
                    System.out.println("密码：");
                    String passWord = sc.nextLine();

                    //登录功能: 调用登录功能 进行判断
                    boolean flag = ud.isLogin(userName, passWord);
                    if (flag) {
                        System.out.println("登录成功！");

                        //游戏
                        System.out.println("是否开始游戏？（Y/N）");
                        while(true) {
                            String yn = sc.nextLine();
                            if (yn.equalsIgnoreCase("y")) {
                                GuessNumber.start();
                                System.out.println("再来一次？（Y/N）");
                            } else {
                                System.out.println("----------------游戏结束----------------");
                                System.exit(0);
                            }
                        }
                    } else {
                        System.out.println("用户名或密码错误，请重试");
                    }
                    break;

                case "2":
                    //注册功能: 输入
                    System.out.println("----------------注册----------------");
                    System.out.println("请输入您要注册的用户名：");
                    String newUserName = sc.nextLine();
                    System.out.println("请输入您要设置的密码：");
                    String newPassWrod = sc.nextLine();

                    //注册功能：写入
                    //创建一个用户对象,并将注册的信息写入
                    User u = new User();
                    u.setUserName(newUserName);
                    u.setPassWord(newPassWrod);
                    //将携带注册信息的用户对象放入用户集合
                    ud.regist(u);
                    System.out.println("注册成功！");
                    break;

                case "3":
                    System.out.println("----------------谢谢使用----------------");
                    System.exit(0);

                case "4":
                    Random r = new Random();
                    int count =0;
                    for(int x=0; x<100; x++){
                        if(count % 10 ==0){
                            System.out.println();
                        }
                        System.out.print(r.nextInt(50)+1+"\t");
                        count++;
                    }
                    System.out.println();

                default:
                    break;
            }
        }
    }
}
