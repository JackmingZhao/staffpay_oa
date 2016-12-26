package com.cn.tym.service;

import com.cn.tym.pojo.icpay.User;

public interface IUserService {

	public User getUserById(String userId);
	
	public void updateUser(User user);

}
