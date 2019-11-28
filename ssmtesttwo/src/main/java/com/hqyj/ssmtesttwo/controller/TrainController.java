package com.hqyj.ssmtesttwo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.ssmtesttwo.modal.Student;
import com.hqyj.ssmtesttwo.modal.Train;
import com.hqyj.ssmtesttwo.service.TrainService;
import com.hqyj.ssmtesttwo.util.ValCode;

@Controller
public class TrainController {
	@Autowired
	TrainService trainService;
	@Autowired
	ValCode valCode;

	// 查询
	@RequestMapping("selectAllTrain.do")
	@ResponseBody
	public HashMap<String, Object> selectAllTrain(Train t) {
		System.err.println(t.toString());
		return trainService.selectAllTrain(t);
	}

	// 新增
	@RequestMapping("addTrain.do")
	@ResponseBody
	public boolean add(Train t) {
		return trainService.add(t);
	}

	// 修改
	@RequestMapping("updateTrain.do")
	@ResponseBody
	public boolean update(Train t) {
		return trainService.update(t);
	}

	// 删除
	@RequestMapping("delTrain.do")
	@ResponseBody
	public boolean del(Integer id) {
		return trainService.del(id);
	}
}
