package com.imooc.contoller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

@RestController
@RequestMapping("/user")
class UserContoller {
	
	@RequestMapping("/getUser")
	public User getUser() {
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc");
		return u;
	}
	
	@RequestMapping("/getUserJson")
	public IMoocJSONResult getUserJson() {
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		return IMoocJSONResult.ok(u);
	}
}
