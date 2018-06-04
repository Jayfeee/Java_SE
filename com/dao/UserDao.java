package com.dao;

import com.pojo.User;

/**
 * 这是用户的操作类
 *
 * @author 刘飞
 * @version V1.0
 */
public interface UserDao {
    /**
     * 用户注册功能
     *
     * @param user 用户对象
     */
    public abstract void regist(User user);

    /**
     * 用户登录功能
     *
     * @param userName 用户名
     * @param passWord 用户密码
     * @return
     */
    public abstract boolean isLogin(String userName, String passWord);
}
