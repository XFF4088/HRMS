package com.hqyj.ssmtesttwo.testDao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hqyj.ssmtesttwo.dao.StudentDao;
import com.hqyj.ssmtesttwo.modal.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class StudentDaoTest {

	@Autowired
	StudentDao studentDao;
	@Test
	public void testselectStudentAndClassName(){
	
	}
}
