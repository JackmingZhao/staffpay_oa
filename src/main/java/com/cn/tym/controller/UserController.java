package com.cn.tym.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.tym.pojo.icpay.User;
import com.cn.tym.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping(value="/showUser/{id}", method=RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable String id) {
		User user = new User();
		user = userService.getUserById(id);
		return user;
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public @ResponseBody User updateUser(@RequestBody User user) {
		System.out.println("接收到的参数："+user.getUserid());
		//userService.updateUser(user);
		return user;
	}

}
