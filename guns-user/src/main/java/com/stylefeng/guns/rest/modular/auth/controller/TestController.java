package com.stylefeng.guns.rest.modular.auth.controller;

import com.stylefeng.guns.api.User;
import com.stylefeng.guns.api.UserInfoModel;
import com.stylefeng.guns.rest.mapper.UserMapper;
import com.stylefeng.guns.rest.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("test")
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UsersMapper usersMapper;

    @RequestMapping(value = "register")
    public String test(UserInfoModel userInfoModel){
        userMapper.insert(userInfoModel);
        return "success";
    }

    @RequestMapping(value = "users")
    public List<User> test01(){
        List<User> userAll = usersMapper.findUserAll();
        return userAll;
    }


}
