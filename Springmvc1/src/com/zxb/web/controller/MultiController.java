package com.zxb.web.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MultiController extends MultiActionController {

	public ModelAndView add(HttpServletRequest request,HttpServletResponse reponse){
		
		System.out.println("----add----");
		return new ModelAndView("/multi","method","add");
		
	}
	
public ModelAndView update(HttpServletRequest request,HttpServletResponse reponse){
		
		System.out.println("----update----");
		return new ModelAndView("/multi","method","update");
		
	}
}
