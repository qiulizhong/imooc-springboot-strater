package com.imooc.contoller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;


@RestController
public class HelloContoller {
	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/getResource")
	public IMoocJSONResult gerResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return IMoocJSONResult.ok(bean);
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot~~~";
	}
	
}
