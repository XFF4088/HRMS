package com.hqyj.ssmtesttwo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.hqyj.ssmtesttwo.modal.Student;

public interface StudentDao {

	//查询
	List<Student> selectStudent(Student s);
	//查询总条数
	int selectCount(Student s);
	//增加
	int add(Student s);
	//删除
	int del(Integer id);
	//修改
	int update(Student s);

	
	
	
}
