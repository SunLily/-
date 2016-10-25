package com.cn.Pojo;

/**
 * Created by alfa7055 on 2016/10/13.
 * 相册
 */
public class Folder {
    private Integer folderId; //相册id
    private String folderName; //相册名称
    private String folderInfo; //相册说明
    private Integer userId; //用户Id
    private String folderImg; //相册主图

    public String getFolderImg() {
        return folderImg;
    }

    public void setFolderImg(String folderImg) {
        this.folderImg = folderImg;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderInfo() {
        return folderInfo;
    }

    public void setFolderInfo(String folderInfo) {
        this.folderInfo = folderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
