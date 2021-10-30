package com.example.pojo.onetomore;

import lombok.Data;

import java.util.List;

@Data
public class bosses {
    private int id;
    private String name;
    private int pwd;
    private List<users> usersList;
}
