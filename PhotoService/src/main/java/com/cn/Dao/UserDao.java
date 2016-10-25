package com.cn.Dao;

import com.cn.Pojo.User;
import com.cn.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by alfa7055 on 2016/10/14.
 */
public interface UserDao extends Mapper<User> {

    int addUser(User user);

}
