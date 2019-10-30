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
	
	
	//��ѯ
	@RequestMapping("selectStudent.do")
	@ResponseBody
	public HashMap<String,Object> selectStudent(Student s){
		System.err.println(s.toString());
		return studentService.selectStudent(s);
	}
	
	//����
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(Student s){
		return studentService.add(s);
	}
	
	//�޸�
	@RequestMapping("update.do")
	@ResponseBody
	public boolean update(Student s){
		return studentService.update(s);
	}
	
	//ɾ��
	@RequestMapping("del.do")
	@ResponseBody
	public boolean del(Integer id){
		return studentService.del(id);
	}
	//��¼�ύajaxʵ��
	@RequestMapping("loginSubmit.do")
	@ResponseBody
	public boolean loginSubmit(HttpServletRequest request,String valCode){
		System.err.println("���������֤���ǣ�"+valCode);
		//��ȡ����session�е���֤��
		HttpSession session = request.getSession();
		String code = session.getAttribute("valCode")+"";
		if(code.equalsIgnoreCase(valCode)){
			return true;
		}
		return false;
	}
	

	
	//��֤������
	@RequestMapping(method=RequestMethod.GET,value="valCode.do")
	public void valCode(HttpServletRequest request,HttpServletResponse response){
		//����ͼƬ��ʽ
	    response.setContentType("image/png");
	    //��ʼ������֤��
	    valCode.createCode();
	    //��ȡ��֤��ֵ
	    String code =valCode.getCode();
	    
	    HttpSession session =request.getSession();
	    //��֤��ֵ����session��
	    session.setAttribute("valCode", code);
	    
	    try {
	    	//������֤��ͼƬ
			valCode.write(response.getOutputStream());
		} catch (IOException e) {
			System.err.println("��֤�����ɳ����쳣");
			e.printStackTrace();
		}
		
	}
}
