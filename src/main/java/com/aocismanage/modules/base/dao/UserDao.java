package com.aocismanage.modules.base.dao;

import com.aocismanage.modules.base.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> select();

    List<User> login(@Param("loginCode")String loginCode, @Param("password")String password);
}
