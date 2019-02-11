package com.stylefeng.guns.rest.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.UserApi;
import com.stylefeng.guns.api.UserInfoModel;
import com.stylefeng.guns.api.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Slf4j
@Service(interfaceClass = UserApi.class)
@Component
public class UserService implements UserApi {

    @Override
    public Integer login(String username, String password) {
        log.info("username : {} password : {}",username,password);
        return 0;
    }

    @Override
    public int registUser(UserModel userModel) {
        UserInfoModel userInfoModel = new UserInfoModel();
        BeanUtils.copyProperties(userModel,userInfoModel);

        return 0;
    }

    @Override
    public Boolean checkUser(String username) {
        return null;
    }

    @Override
    public UserInfoModel getUserInfo(int uuid) {
        return null;
    }

    @Override
    public UserInfoModel updateUserInfo(UserInfoModel userInfoModel) {
        return null;
    }
}
