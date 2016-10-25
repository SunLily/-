package com.cn.Controller;

import com.cn.Pojo.User;
import com.cn.ResponseData.ResponseData;


import com.cn.Service.UserService;
import com.cn.View.UserView;
import com.cn.util.ConvertService;
import com.cn.util.Md5;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;


/**
 * Created by alfa7055 on 2016/10/15.
 */
@Controller
public class UserController {
    private Logger log = Logger.getLogger("UserController");

    @Autowired
    private UserService userService;
    /**
     * 登陆
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResponseData login(@ModelAttribute UserView userView){
        ResponseData responseData = new ResponseData();
        String name = userView.getName();
        String pwd = userView.getPwd();
        if(null == name || null == pwd || name.equals("") ||  pwd.equals("")){
            responseData.setMessage("用户名或密码为空");
            return responseData;
        }
        Md5 md5 = new Md5();
        String md5Pwd = md5.GetMD5Code(userView.getPwd());
        User user = userService.getUser(name, md5Pwd);
        if(null != user.getUserName()){
            responseData.setMessage("登陆成功");
            responseData.setCode(200);
        }else{
            responseData.setMessage("用户名或密码错误");
            responseData.setCode(501);
        }
        return responseData;
    }

    /**
     * 注册
     */
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData regist(@ModelAttribute UserView userView){
        String message = "";
        Md5 md5 = new Md5();
        String pwd = md5.GetMD5Code(userView.getPwd());
        userView.setPwd(pwd);
        ResponseData responseData = new ResponseData();
        //查看用户名是否存在
        boolean userName = userService.getUserName(userView.getName());
        if(userName){
            responseData.setMessage("用户名已存在");
            return responseData;
        }

        if(userView.getGender().equals("1")){
            userView.setGender("男");
        }else{
            userView.setGender("女");
        }
        try {
            User user = this.addUser(userView);
            int i = userService.addUser(user);
            if(i > 0 ){
                message = "add success";
                responseData.setCode(200);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        responseData.setMessage(message);
        return responseData;
    }
    private User addUser(UserView view){
        User user = new User();
        user.setUserName(view.getName());
        user.setUserPwd(view.getPwd());
        user.setUserSex(view.getGender());
        user.setCreateT(new Date());
        user.setUpdateT(new Date());
        return user;
    }


}
