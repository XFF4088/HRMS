package com.hqyj.ssmtesttwo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.ssmtesttwo.modal.Student;
import com.hqyj.ssmtesttwo.modal.Train;
import com.hqyj.ssmtesttwo.modal.TrainPJ;
import com.hqyj.ssmtesttwo.service.TrainPJService;
import com.hqyj.ssmtesttwo.service.TrainService;
import com.hqyj.ssmtesttwo.util.ValCode;

@Controller
public class TrainPJController {
	@Autowired
	TrainPJService trainPJService;
	@Autowired
	ValCode valCode;

	// 查询
	@RequestMapping("selectTrainPJ.do")
	@ResponseBody
	public HashMap<String, Object> selectTrainPJ(TrainPJ tp) {
		return trainPJService.selectTrainPJ(tp);
	}

	
}
