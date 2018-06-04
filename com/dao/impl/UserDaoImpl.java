package com.dao.impl;

import com.dao.UserDao;
import com.pojo.User;

import java.util.ArrayList;

/**
 * 这是用户操作的具体实现类
 *
 * @author 刘飞
 * @verion V1.0
 */
public class UserDaoImpl implements UserDao {
    private static ArrayList<User> array = new ArrayList<User>();

    @Override
    public void regist(User user) {
        //将注册信息写入集合
        array.add(user);
    }

    @Override
    public boolean isLogin(String userName, String passWord) {
        for(User u: array){
            if(u.getUserName().equals(userName) && u.getPassWord().equals(passWord)){
                return true;
            }
        }
        return false;
    }
}
