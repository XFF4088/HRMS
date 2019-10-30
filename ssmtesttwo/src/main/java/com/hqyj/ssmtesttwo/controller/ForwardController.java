package com.hqyj.ssmtesttwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {

	//跳转到登录页面
	@RequestMapping("loginPage.do")
	public String login(){
		return "login";
	}
	
	//跳转到首页
	@RequestMapping("index.do")
	public String index(){
		return "index";
	}

	//具体工作页面
	@RequestMapping("studentPage.do")
	public String studentPage(){
		
		return "student";
	}
	
	//欢迎页面
	@RequestMapping("welcome.do")
	public String welcomePage(){
		return "welcome";
	}
	
		
}
