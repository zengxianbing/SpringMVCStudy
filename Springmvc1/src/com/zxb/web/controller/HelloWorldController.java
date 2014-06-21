package com.zxb.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		System.out.println("---hell0--");
		
		String hell0="hello world!";
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("map1", "sdf");
		map.put("map2", "123");
		return new  ModelAndView("/welcome","map",map);
	}

}
