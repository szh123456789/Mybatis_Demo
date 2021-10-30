package com.example.dao;

import com.example.pojo.onetomore.bosses;
import com.example.pojo.onetomore.users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bossdaot {

    List<bosses>  selectbyid(int id);

    bosses selectuserscon(@Param("id") int id);

    bosses selectuserscon2(@Param("id") int id);
}
