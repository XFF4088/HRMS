package com.hqyj.ssmtesttwo.service;

import java.util.HashMap;

import com.hqyj.ssmtesttwo.modal.Student;

public interface StudentService {

	//≤È—Ø
	HashMap<String,Object> selectStudent(Student s);

	//
	boolean add(Student s);
	boolean update(Student s);
	boolean del(Integer id);

}
