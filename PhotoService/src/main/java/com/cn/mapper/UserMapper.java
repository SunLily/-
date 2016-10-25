package com.cn.mapper;

import com.cn.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import com.cn.Pojo.*;

import java.util.List;

/**
 * Created by alfa7055 on 2016/10/13.
 */
@Repository
public class UserMapper {

    @Autowired
    private UserDao userDao;

    public  int addUser(User user){
        return this.userDao.addUser(user);
    }
}
