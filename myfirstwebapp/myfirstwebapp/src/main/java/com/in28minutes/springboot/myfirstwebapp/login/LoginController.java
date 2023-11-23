package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	// /login => com.in28minutes.springboot.myfirstwebapp.hello.LoginController => login.jsp
	
	@RequestMapping("login")
	public String gotoLoginPage() {
		return "login";    // jsp 이름
	}
}
