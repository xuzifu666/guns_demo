package com.stylefeng.guns.rest.modular.auth.util;

import com.stylefeng.guns.api.UserInfoModel;

public class UserInfoThreadLocal {

    public static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void setUserId(String userId){
        threadLocal.set(userId);
    }

    public static String getUserId(){
       return threadLocal.get();
    }

}
