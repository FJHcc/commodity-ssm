package com.jiahao.pojo;

import java.util.Date;

/**
 * @author fangjiahao
 * @data 2019/2/15 10:49
 */
public class User {
    private Integer Id;
    private String Name;
    private String Password;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
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
