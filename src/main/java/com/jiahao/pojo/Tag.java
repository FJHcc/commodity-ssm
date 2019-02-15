package com.jiahao.pojo;

import java.util.Date;

/**
 * @author fangjiahao
 * @data 2019/2/14 15:26
 */
public class Tag {
    private Integer Id;
    private String Name;
    private boolean isDelete;
    private Date CreateAt;
    private Date LastEditAt;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Date getCreateAt() {
        return CreateAt;
    }

    public void setCreateAt(Date createAt) {
        CreateAt = createAt;
    }

    public Date getLastEditAt() {
        return LastEditAt;
    }

    public void setLastEditAt(Date lastEditAt) {
        LastEditAt = lastEditAt;
    }
}
