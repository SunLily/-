package com.cn.Dao;

import com.cn.Pojo.Folder;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by alfa7055 on 2016/10/24.
 */
public interface FolderDao extends Mapper<Folder> {
    int addFolder(Folder folder);
}
