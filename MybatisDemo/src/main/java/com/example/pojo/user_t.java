package com.example.pojo;

public class user_t {

    private int id;

    private String name;

    private int ag;

    public user_t() {
    }


    public user_t(int id, String name, int ag) {
        this.id = id;
        this.name = name;
        this.ag = ag;
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

    public int getAg() {
        return ag;
    }

    public void setAg(int ag) {
        this.ag = ag;
    }

    @Override
    public String toString() {
        return "user_t{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ag=" + ag +
                '}';
    }
}
