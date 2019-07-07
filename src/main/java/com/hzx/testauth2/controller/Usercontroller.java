package com.hzx.testauth2.controller;


import com.alibaba.fastjson.JSON;
import com.hzx.testauth2.dto.UserLoginDTO;
import com.hzx.testauth2.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {


    @GetMapping("/login")
    public String login(UserLoginDTO userLoginDTO) throws Exception {

        String username = userLoginDTO.getUsername();

        String password = userLoginDTO.getPassword();


        if(username == null && !username.equals("hzx")){

            throw  new Exception("user doesn't exist");
        }

        if(password == null && !password.equals("123456")){

            throw  new Exception(" password doesn't exist");

        }


        User user = new User();

        user.setUsername("hzx");
        user.setMobile("17737090975");
        user.setRole("admin");
        user.setEmail("289778188@.qq.com");

        String s = JSON.toJSONString(user);

        return s;


    }


}
