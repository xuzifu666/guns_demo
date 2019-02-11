package com.stylefeng.guns;

import com.stylefeng.guns.api.UserInfoModel;
import com.stylefeng.guns.rest.UserApplication;
import com.stylefeng.guns.rest.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
@Slf4j
public class GunsRestApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {

		List<UserInfoModel> userInfoModels = userMapper.selectAll();
		log.info(userInfoModels.toString());
	}

}
