package com.aocismanage.modules.base.service;

import com.aocismanage.modules.base.dao.UserDao;
import com.aocismanage.modules.base.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> select(){
       return userDao.select();
    }

    public List<User> login(@Param("loginCode")String loginCode, @Param("password")String password){
        return userDao.login(loginCode,password);
    }

}
