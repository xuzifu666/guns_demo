package com.stylefeng.guns.rest.modular.auth.controller;

import com.stylefeng.guns.api.UserInfoModel;
import com.stylefeng.guns.core.exception.GunsException;
import com.stylefeng.guns.rest.common.exception.BizExceptionEnum;
import com.stylefeng.guns.rest.mapper.UserMapper;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthRequest;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthResponse;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.modular.auth.validator.IReqValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 请求验证的
 *
 * @author fengshuonan
 * @Date 2017/8/24 14:22
 */
@RestController
@Slf4j
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "${jwt.auth-path}")
    public ResponseEntity<?> createAuthenticationToken(AuthRequest authRequest) {

        List<UserInfoModel> userInfoModels = userMapper.selectAll();
        log.info(userInfoModels.toString());
        return null;

//        boolean validate = reqValidator.validate(authRequest);
//
//        if (validate) {
//            final String randomKey = jwtTokenUtil.getRandomKey();
//            final String token = jwtTokenUtil.generateToken(authRequest.getUserName(), randomKey);
//            return ResponseEntity.ok(new AuthResponse(token, randomKey));
//        } else {
//            throw new GunsException(BizExceptionEnum.AUTH_REQUEST_ERROR);
//        }
    }
}
