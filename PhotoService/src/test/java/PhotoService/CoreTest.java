package PhotoService;


import com.cn.Pojo.User;
import com.cn.Service.UserService;
import com.cn.Service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:applicationContext.xml"})
public class CoreTest {

    @Autowired
    private UserService userService;
    @Test
    public void addUser() throws ClassNotFoundException {
        User user = new User();
//        user.setUserId(1234);
        user.setUserName("admin");
        user.setUserPwd("asdsdaasdasa");
        user.setUserSex("男");
        userService.addUser(user);

    }

    //查看用户名是否存在
    @Test
    public void getUserName(){
        boolean admin = userService.getUserName("admin");
        System.out.println(admin);
    }

    //test lambda
    @Test
    public void testLambda(){


    }


}