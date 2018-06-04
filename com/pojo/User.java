package com.pojo;

/**
 * 这是用户的基本描述类
 *
 * @author 刘飞
 * @version V1.0
 */
public class User {
    private String userName;
    private String passWord;

    public User(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

