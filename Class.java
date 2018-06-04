package com.company;

//定义一个说英语的接口
interface SpeakEnglish{
    //说英语
    public abstract void speak();
}


//定义人的抽象类
abstract class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        System.out.println("Everybody have to sleep");
    }

    public void getInfo(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }

    public abstract void eat();
}


//定义运动员抽象类
abstract class Player extends Person{
    public Player (){}

    public Player(String name,int age){
        super(name,age);
    }

    //加入学习功能
    public abstract void study();
}


//定义教练抽象类
abstract class Coach extends Person{
    public Coach(){}

    public Coach(String name,int age){
        super(name,age);
    }

    //加入执教功能
    public abstract void teach();
}


//定义篮球运动员类
class BasketballPlayer extends Player{
    public BasketballPlayer(){}

    public BasketballPlayer(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("篮球运动员需要吃营养餐");
    }

    public void study(){
        System.out.println("篮球运动员学习运球和投篮");
    }
}


//定义乒乓球运动员类
class PingpangPlayer extends Player implements SpeakEnglish{
    public PingpangPlayer(){}

    public PingpangPlayer(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("乒乓球运动员也需要吃营养餐");
    }

    public void study(){
        System.out.println("乒乓球运动员学习发球和接球");
    }

    public void speak(){
        System.out.println("乒乓球运动员为了出国交流需要学习英语");
    }
}


//定义篮球教练类
class BasketballCoach extends Coach{
    public BasketballCoach(){}

    public BasketballCoach(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("篮球教练吃工作餐");
    }

    public void teach(){
        System.out.println("篮球教练教运球和投篮");
    }
}


//定义乒乓球教练类
class PingpangCoach extends Coach implements SpeakEnglish{
    public PingpangCoach(){}

    public PingpangCoach(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("乒乓球教练吃工作餐");
    }

    public void teach(){
        System.out.println("乒乓球教练教发球和接球");
    }

    public void speak(){
        System.out.println("乒乓球教练为了出国交流需要学习英语");
    }
}

//定义测试类
class Main{
    public static void main(String[] args){
        BasketballPlayer bp = new BasketballPlayer("姚明",33);
        bp.getInfo();
        bp.eat();
        bp.sleep();
        bp.study();
        System.out.println("------------");

        PingpangPlayer pp = new PingpangPlayer("张继科",28);
        pp.getInfo();
        pp.eat();
        pp.sleep();
        pp.study();
        pp.speak();
        System.out.println("------------");

        PingpangCoach pc = new PingpangCoach("张三",44);
        pc.getInfo();
        pc.eat();
        pc.sleep();
        pc.teach();
        pc.speak();
        System.out.println("------------");

        BasketballCoach bc = new BasketballCoach("王五",33);
        bc.getInfo();
        bc.eat();
        bc.sleep();
        bc.teach();
        System.out.println("------------");

    }
}





