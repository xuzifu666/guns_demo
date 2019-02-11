package com.stylefeng.guns.api;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "user_info")
public class UserInfoModel implements Serializable {

    private Integer uuid;
    private String userName;
    private String userPwd;
    private String nickName;
    private Integer userSex;
    private String birthday;
    private String email;
    private String userPhone;
    private String address;
    private String headUrl;
    private Date beginTime;
    private Date updateTime;

}
