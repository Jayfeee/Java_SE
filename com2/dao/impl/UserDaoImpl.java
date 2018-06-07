package com.company.dao.impl;


import com.company.dao.UserDao;
import com.company.pojo.User;

import java.io.*;

/**
 * 这是用户操作的具体实现类
 *
 * @author 刘飞
 * @verion V1.1
 */
public class UserDaoImpl implements UserDao{
    //为了保证程序一加载就创建，以防用户直接登录找不到此文件
    private static File file = new File("Users.txt");
    static{
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("创建用户信息文件失败");
            e.printStackTrace();
        }
    }

    @Override
    public boolean isLogin(String userName, String passWord) {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("Users.txt"));
            String line = null;
            while((line = br.readLine()) != null){
                //将文件中存储的userName=passWord格式拆分后比较
                String[] strArr = line.split("=");
                if(userName.equals(strArr[0]) && passWord.equals(strArr[1])){
                    return true;
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("未注册的用户名");
            //e.printStackTrace();
        }catch (IOException e){
            System.out.println("登录失败");
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public void regist(User user) {
        BufferedWriter bw = null;
        try{                                     //为了保证数据是追加写入，此处⬇必须写true
            bw = new BufferedWriter(new FileWriter("Users.txt",true));
            //存储为userName = passWord格式
            bw.write(user.getUserName()+"="+user.getPassWord());
            bw.newLine();
            bw.flush();
            bw.close();
        }catch(IOException e){
            System.out.println("用户注册失败");
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}