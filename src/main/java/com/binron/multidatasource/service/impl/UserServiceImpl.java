package com.binron.multidatasource.service.impl;


import com.binron.multidatasource.mapper.base.BaseMapper;
import com.binron.multidatasource.mapper.master.UserMapper;
import com.binron.multidatasource.pojo.User;
import com.binron.multidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 用户操作实现类
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User>  implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	protected BaseMapper<User> getMapper() {
		return this.userMapper;
	}
	
}
