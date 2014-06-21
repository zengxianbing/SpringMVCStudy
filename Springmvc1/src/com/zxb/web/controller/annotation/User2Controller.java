package com.zxb.web.controller.annotation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zxb.web.controller.entity.User2;
import com.zxb.web.services.IUserManager2;

@Controller
@RequestMapping("/user22")
public class User2Controller {
	
	@Resource(name="userManager")
	private IUserManager2 userManager;
	
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		
		return "/addUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User2 user2){
		userManager.addUser(user2);
		return "/success";
	}
	
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request){
		List<User2> user = userManager.getAllUser();
		java.util.Iterator<User2> it=user.iterator();
		while(it.hasNext()){
		
			User2 user2=(User2)it.next();
			System.out.println(user2.getAge());
		}
		
		request.setAttribute("user", user);
		
		return "/userManager";
	}
	
	@RequestMapping("/delUser")
	public void delUser(String id,HttpServletResponse response){
		String result = "{\"result\":\"error\"}";
		if(userManager.delUser(id)){
			result = "{\"result\":\"success\"}";
		}
		PrintWriter out = null;
		response.setContentType("application/json");
		
		try {
			out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping("/getUser")
	public String getUser(String id,HttpServletRequest request){
		User2 user=userManager.getUser(id);
		request.setAttribute("user", user);
		return "/editUser";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(User2 user,HttpServletRequest request){
		if(userManager.updateUser(user)){
			user=userManager.getUser(user.getId());
			request.setAttribute("user", user);
			return "/editUser";
		}else{
			return "/error";
		}
	}
	
	
	

}
