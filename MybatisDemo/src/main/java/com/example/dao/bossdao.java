package com.example.dao;

import com.example.pojo.boss;

import java.util.List;
import java.util.Map;

public interface bossdao {

    int insert(boss boss);
    boss  selecttobos(int id);
    List<boss> selectbyfor(Map map);
}
