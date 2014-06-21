package com.zxb.entity;

public class User {

	private int id;
	public int getId() {
		return id;
	}
	public User(int id, String username, String pwd, int age, String address) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.age = age;
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String username;
	private String pwd;
	
	private int age;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
