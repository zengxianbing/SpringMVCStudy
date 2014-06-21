package com.zxb.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zxb.dao.UserDS;
import com.zxb.entity.User;

@Controller
@RequestMapping("/api/user")
public class UserController {

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public String getall(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		UserDS userDS = new UserDS();
		List<User> userList = userDS.getAll();
		ObjectMapper mapper = new ObjectMapper();

		mapper.setVisibility(JsonMethod.FIELD, Visibility.ANY);
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
      
		String jsonString = mapper.writeValueAsString(userList);
	    response.setCharacterEncoding("UTF-8"); //设置编码格式  
        response.setContentType("text/html");   //设置数据格式  
		response.getWriter().write(jsonString);
		return null;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		
		
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		if(username.equals("aaa")&&pwd.equals("123456")){
			
			   response.setCharacterEncoding("UTF-8"); //设置编码格式  
		        response.setContentType("text/html");   //设置数据格式  
				response.getWriter().write("{\"result\":\"ok\"}");
		}else{
			   response.setCharacterEncoding("UTF-8"); //设置编码格式  
		        response.setContentType("text/html");   //设置数据格式  
				response.getWriter().write("{\"result\":\"no\"}");
		}
	   
		return null;
	}
}
