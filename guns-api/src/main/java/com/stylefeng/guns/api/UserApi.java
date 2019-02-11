package com.stylefeng.guns.api;

public interface UserApi {

    public Integer login(String username ,String password);

    public int registUser(UserModel userModel);

    public Boolean checkUser(String username);

    public UserInfoModel getUserInfo(int uuid);

    public UserInfoModel updateUserInfo(UserInfoModel userInfoModel);

}
