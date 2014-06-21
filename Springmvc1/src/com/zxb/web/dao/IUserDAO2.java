package com.zxb.web.dao;

import java.util.List;

import com.zxb.web.controller.entity.User2;

public interface IUserDAO2 {

	public void addUser(User2 user);

	public List<User2> getAllUser();

	public boolean delUser(String id);

	public User2 getUser(String id);

	public boolean updateUser(User2 user2);
}
