package com.zxb.spring.charpter2.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

public class MyAbstractCommandController extends AbstractCommandController {

	public MyAbstractCommandController() {
		//设置命令对象实现类
		setCommandClass(UserModel.class);
		}
	@Override
	protected ModelAndView handle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object command, BindException arg3)
			throws Exception {
		//将命令对象转换为实际类型
		UserModel user = (UserModel) command;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("abstractCommand");
		mv.addObject("user", user);
		return mv;
	}

}
