package com.zxb.web.services;

public class SpringManager implements ISpring {

	public String get() {
		System.out.println("------I am springManager----");

		return "I am getMethod";
	}

}
