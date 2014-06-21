package com.zxb.web.services;

import java.util.List;

import com.zxb.web.controller.entity.User2;
import com.zxb.web.dao.IUserDAO2;

public class UserManager2 implements IUserManager2 {

	private IUserDAO2 userDao;
	public IUserDAO2 getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDAO2 userDao) {
		this.userDao = userDao;
	}

	public void addUser(User2 user) {

		userDao.addUser(user);
	}

	public boolean delUser(String id) {
		return userDao.delUser(id);
		
	}

	public List<User2> getAllUser() {
		return userDao.getAllUser();
		
		
	}

	public User2 getUser(String id) {
		return userDao.getUser(id);
	}

	public boolean updateUser(User2 user2) {
		return userDao.updateUser(user2);
	}

}
