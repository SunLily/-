package com.cn.Service;

import com.cn.Dao.UserDao;
import com.cn.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by alfa7055 on 2016/10/14.
 */

public interface UserService {
    //用户注册
    public int addUser(User user);

    //查询用户名是否已存在
    public boolean getUserName(String name);

    //根据用户名密码查找用户
    public User getUser(String name, String pwd);
}
