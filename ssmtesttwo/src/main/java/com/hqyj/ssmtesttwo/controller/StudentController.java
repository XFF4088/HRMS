package com.hqyj.ssmtesttwo.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

import com.hqyj.ssmtesttwo.modal.Student;
import com.hqyj.ssmtesttwo.service.StudentService;
import com.hqyj.ssmtesttwo.util.ValCode;
/**
 * 
 * @author wj
 *
 */
@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	@Autowired
	ValCode valCode;
	
	
	//查询
	@RequestMapping("selectStudent.do")
	@ResponseBody
	public HashMap<String,Object> selectStudent(Student s){
		System.err.println(s.toString());
		return studentService.selectStudent(s);
	}
	
	//新增
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(Student s){
		return studentService.add(s);
	}
	
	//修改
	@RequestMapping("update.do")
	@ResponseBody
	public boolean update(Student s){
		return studentService.update(s);
	}
	
	//删除
	@RequestMapping("del.do")
	@ResponseBody
	public boolean del(Integer id){
		return studentService.del(id);
	}
	//登录提交ajax实现
	@RequestMapping("loginSubmit.do")
	@ResponseBody
	public boolean loginSubmit(HttpServletRequest request,String valCode,String sName,String userPwd){
		System.err.println("你输入的验证码是："+valCode);
		//获取存入session中的验证码
		HttpSession session = request.getSession();
		String code = session.getAttribute("valCode")+"";
		String userPwd1 = studentService.selectByName(sName);
		System.out.println(sName);
		System.out.println(userPwd);
		System.out.println(userPwd1);
		System.out.println(valCode);
		if(code.equalsIgnoreCase(valCode) && userPwd1.equals(userPwd)){
			return true;
		}
		return false;
	}
	

	
	//验证码生成
	@RequestMapping(method=RequestMethod.GET,value="valCode.do")
	public void valCode(HttpServletRequest request,HttpServletResponse response){
		//设置图片格式
	    response.setContentType("image/png");
	    //开始生成验证码
	    valCode.createCode();
	    //获取验证码值ֵ
	    String code =valCode.getCode();
	    
	    HttpSession session =request.getSession();
	    //验证码值存入session中
	    session.setAttribute("valCode", code);
	    
	    try {
	    	//生成验证码图片
			valCode.write(response.getOutputStream());
		} catch (IOException e) {
			System.err.println("验证码生成出现异常");
			e.printStackTrace();
		}
		
	}
}
