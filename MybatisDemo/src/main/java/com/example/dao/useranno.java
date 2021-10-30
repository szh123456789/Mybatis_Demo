package com.example.dao;

import com.example.pojo.user;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface useranno {

    @Select("select * from user where id=#{id} ")
    user selectbyanno(@Param("id") int id);


}
