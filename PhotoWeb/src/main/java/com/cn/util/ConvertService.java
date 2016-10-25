package com.cn.util;

import com.cn.Pojo.User;
import com.cn.View.UserView;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alfa7055 on 2016/10/18.
 */
public class ConvertService {
    public <T,V> List<V> pubCopy(List<T> sourceObj, Class<V> targetObj)
            throws InstantiationException, IllegalAccessException,InvocationTargetException{
        List<V> result = new ArrayList<V>();
        for (T t : sourceObj) {
            V v = newTclass(targetObj);
            BeanUtils.copyProperties(v, t);
            result.add(v);
        }
        return result;
    }
    public <V> V newTclass(Class<V> clazz)
            throws InstantiationException, IllegalAccessException{
        V v = clazz.newInstance();
        return v;
    }

    
}
