package com.cn.Controller;

import com.cn.ResponseData.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alfa7055 on 2016/10/25.
 */
@Controller
public class FolderController
{
    @RequestMapping("")
    @ResponseBody
    public ResponseData addFolder(){
        ResponseData rep = new ResponseData();


        return rep;
    }

}
