package com.example.pojo;

import lombok.Data;

@Data
public class user {

    private  int id;

    private String name;

    private int age;

    private boss bos;

    private int bid;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public com.example.pojo.boss getBss() {
        return bos;
    }

    public void setBos(com.example.pojo.boss boss) {
        this.bos = boss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public user(int id, String name, int age, int bid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bos=" + bos +
                '}';
    }
}
