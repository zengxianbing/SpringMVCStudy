package com.zxb.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.zxb.entity.User;



public class UserDS {

	private static Map<Integer, User> allUsers;
	static {
		allUsers = new HashMap<Integer, User>();
		User u1 = new User(1,"aaa","123456",12,"长春市");
		User u2 = new User(2,"bbb","123456",12,"长春市");
		allUsers.put(u1.getId(), u1);
		allUsers.put(u2.getId(), u2);
	}
	
	public void add(User u) {
		allUsers.put(u.getId(), u);
	}

	public User get(long id) {
		return allUsers.get(id);
	}

	public List<User> getAll() {
		List<User> Users = new ArrayList<User>();
		for( Iterator<User> it = allUsers.values().iterator(); it.hasNext(); ) {
			User u= it.next();
			Users.add(u);
		}
		return Users;
	}

	public void remove(long id) {
		allUsers.remove(id);
	}

	public void update(User u) {
		allUsers.put(u.getId(), u);
	}

}
