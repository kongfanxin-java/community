package com.xinrui.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinrui.entity.User;
import com.xinrui.mapper.UserMapper;
import com.xinrui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * User basic infomation 服务实现类
 * </p>
 *
 * @author kongfx
 * @since 2019-04-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findByUsername(String username) {
		return userMapper.selectUserAndRolesByName(username);
	}
}