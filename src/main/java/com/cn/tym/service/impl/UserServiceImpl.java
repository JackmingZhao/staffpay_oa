package com.cn.tym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tym.dao.icpay.UserMapper;
import com.cn.tym.pojo.icpay.User;
import com.cn.tym.service.IUserService;
import com.google.code.ssm.api.ParameterDataUpdateContent;
import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;
import com.google.code.ssm.api.UpdateSingleCache;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userDao;

	@Override
	//@ReadThroughSingleCache(namespace = "ItemObj", expiration = 3600)
	public User getUserById(/**@ParameterValueKeyProvider**/ String userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

	@Override
	//@UpdateSingleCache(namespace = "ItemObj")
	public void updateUser(/**@ParameterValueKeyProvider @ParameterDataUpdateContent**/ User user) {
		this.userDao.updateByPrimaryKey(user);
	}

}
