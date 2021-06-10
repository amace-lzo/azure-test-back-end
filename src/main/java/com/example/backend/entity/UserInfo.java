package com.example.backend.entity;

import java.util.Date;

public class UserInfo {
    private String id;
    private String name;
    private Integer age;
    private Date insertDate;

    public UserInfo() {
    }

    public UserInfo(String id, String name, Integer age, Date insertDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.insertDate = insertDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
