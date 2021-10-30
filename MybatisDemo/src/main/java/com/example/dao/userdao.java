package com.example.dao;

import com.example.pojo.boss;
import com.example.pojo.user;
import com.example.pojo.user_t;
import com.example.pojo.users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface userdao {

   int insertus(user use);

   int insertus2(Map<String,Object> map);

   user_t selectbyuset(int id);

   List<user>  selectuser();

   user  selectById(int id);

   int deleteById(int id);

   int updateById(user use);

   List<users> selecttoboss();

}
