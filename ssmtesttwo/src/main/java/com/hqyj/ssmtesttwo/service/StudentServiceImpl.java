package com.hqyj.ssmtesttwo.service;

import java.util.HashMap;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hqyj.ssmtesttwo.dao.StudentDao;
import com.hqyj.ssmtesttwo.modal.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	//学生信息查询
	@Override
	public HashMap<String,Object>  selectStudent(Student s) {
		HashMap<String,Object>  map = new HashMap<String,Object> ();

		if(s.getsName()!=null&&!s.getsName().equals("")){
			s.setsName("%"+s.getsName()+"%");
		}
		System.err.println("服务端："+s.toString());
		
		//计算分页起始位置
		int start = s.getRows()*(s.getPage()-1);
		s.setStart(start);	
		int total = studentDao.selectCount(s);
		//结果集
		map.put("rows", studentDao.selectStudent(s));
		//总条数
		map.put("total", total);
		return map;
	}

	@Override
	public boolean add(Student s) {
		// TODO Auto-generated method stub
		if(studentDao.add(s)>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Student s) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if(studentDao.update(s)>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean del(Integer id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if(studentDao.del(id)>0){
			return true;
		}
		return false;
	}

	



}
