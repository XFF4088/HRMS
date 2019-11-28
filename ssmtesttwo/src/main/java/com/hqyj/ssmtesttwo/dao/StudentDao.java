package com.hqyj.ssmtesttwo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.hqyj.ssmtesttwo.modal.Student;

public interface StudentDao {

	List<Student> selectStudent(Student s);

	int selectCount(Student s);

	int add(Student s);

	int del(Integer id);

	int update(Student s);

	String selectByName(String userName);
	
	
}
