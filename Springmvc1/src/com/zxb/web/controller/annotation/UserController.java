package com.zxb.web.controller.annotation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	
	@RequestMapping(value="/user/addUser",method=RequestMethod.POST)
	public ModelAndView addUser(){
		
		String result="---addUser--";
		return new ModelAndView("annotation","result",result);
	}
	@RequestMapping(value="/user/delUser",method=RequestMethod.GET)
	public ModelAndView User(){
		
		String result="---delUser--";
		return new ModelAndView("annotation","result",result);
	}
	@RequestMapping(value="/user/toUser",method=RequestMethod.GET)
	public ModelAndView toUser(){
		
		String result="---toUser--";
		return new ModelAndView("annotation","result",result);
	}
}
