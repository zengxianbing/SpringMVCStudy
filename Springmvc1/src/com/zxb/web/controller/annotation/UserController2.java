package com.zxb.web.controller.annotation;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user2")
public class UserController2 {

	
	//@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request){
		
		String result="---addUser-优化版111-";
		request.setAttribute("result", result);
		return "annotation";
	}
	@RequestMapping(value="/delUser",method=RequestMethod.GET)
	public ModelAndView User(){
		
		String result="---delUser-优化版-";
		return new ModelAndView("annotation","result",result);
	}
	@RequestMapping(value="/toUser",method=RequestMethod.GET)
	public ModelAndView toUser(){
		
		String result="---toUser-优化版-";
		return new ModelAndView("annotation","result",result);
	}
}
