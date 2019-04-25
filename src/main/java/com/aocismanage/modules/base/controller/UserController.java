package com.aocismanage.modules.base.controller;

import com.aocismanage.modules.base.entity.User;
import com.aocismanage.modules.base.service.PermissionService;
import com.aocismanage.modules.base.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
@RequestMapping("/User")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(PermissionController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> select( ){

        return userService.select();
    }

    @RequestMapping("/login")
    public String login(Model model, @Param("loginCode")String loginCode, @Param("password")String password, String inputStr, HttpSession session){
        String text = (String) session.getAttribute("code");
        session.setAttribute("loginCode",loginCode+password);
        System.out.println("账号 = "+loginCode);
        System.out.println("密码 = " + password);
        System.out.println("页面验证码文本框 = " + inputStr);
        System.out.println(" session的验证码= " + text);
        List<User> list=userService.login(loginCode,password);
        System.out.println("list = " + list.size());
       if(list.size()>0){
           return "true";

       }else{
           return "false";
       }

        //不区分大小写比较
//        if(loginCode.equals("zhang")&&password.equals("123456")&&inputStr.equalsIgnoreCase(text)){
//            return "true";
//        }else {
//            return "false";
//        }
    }


}
