package com.hqyj.ssmtesttwo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.hqyj.ssmtesttwo.modal.Student;

public interface StudentDao {

	//��ѯ
	List<Student> selectStudent(Student s);
	//��ѯ������
	int selectCount(Student s);
	//����
	int add(Student s);
	//ɾ��
	int del(Integer id);
	//�޸�
	int update(Student s);

	
	
	
}
