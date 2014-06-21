package com.zxb.spring.charpter2.web.model;

public class UserState {


	
	private String desc;
	private UserState(String desc) {
		this.desc = desc;;
	}
	
	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return this.desc;
	}
}
