package com.cn.Service;

import com.cn.Dao.UserDao;
import com.cn.Pojo.User;
import com.cn.mapper.UserMapper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alfa7055 on 2016/10/16.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public int addUser(User user) {
        int i = userDao.addUser(user);
        return i;
    }

    @Override
    @Transactional()
    public boolean getUserName(String name) {
        User u = new User();
        u.setUserName(name);
        List<User> users = userDao.select(u  );
        if(users.size() > 0){
            return true;
        }
       return false;
    }

    @Override
    public User getUser(String name, String pwd) {
        User user = new User();
        user.setUserName(name);
        user.setUserPwd(pwd);
        List<User> select = userDao.select(user);
        if(select.size() > 0){
            return select.get(0);
        }
        return new User();
    }


}
