package com.zxb.web.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.zxb.web.controller.entity.User2;

public class UserDAO2 implements IUserDAO2 {

	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUser(User2 user2) {

		sessionFactory.getCurrentSession().save(user2);
	}

	public boolean delUser(String id) {
    
		String hql="delete User2  u where u.id=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		return (query.executeUpdate()>0);
	}

	public List<User2> getAllUser() {

		String hql="from User2";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

	public User2 getUser(String id) {

		String hql="from User2 u where u.id=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		
		return  (User2)query.uniqueResult();
	}

	public boolean updateUser(User2 user2) {

		String hql="update User2 u set u.userName=?,u.age=? where u.id=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, user2.getUserName());
		query.setString(1, user2.getAge());
		query.setString(2, user2.getId());
		return (query.executeUpdate()>0);
	}

}
