package com.premsai.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning doing?!";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Mike Test One two</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("test body 1 2 3");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	//\src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.jsp
	
	@RequestMapping("/say-hello-jsp")
	
	public String sayHelloJsp() {
		return "sayHello";
	}
	
	
}
