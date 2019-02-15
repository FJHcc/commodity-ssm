package com.jiahao.pojo;


import java.math.BigDecimal;
import java.util.Date;


public class Commodity {
    private Integer Id;
    private String Number;
    private String Name;
    private BigDecimal Price;
    private String Description;
    private Integer StatusId;
    private Date CreateAt;
    private Date LastEditAt;
    private String NameSpelling;
    private BigDecimal NewPrice;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getStatusId() {
        return StatusId;
    }

    public void setStatusId(Integer statusId) {
        StatusId = statusId;
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

    public String getNameSpelling() {
        return NameSpelling;
    }

    public void setNameSpelling(String nameSpelling) {
        NameSpelling = nameSpelling;
    }

    public BigDecimal getNewPrice() {
        return NewPrice;
    }

    public void setNewPrice(BigDecimal newPrice) {
        NewPrice = newPrice;
    }
}
