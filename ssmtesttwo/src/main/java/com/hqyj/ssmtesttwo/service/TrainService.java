package com.hqyj.ssmtesttwo.service;

import java.util.HashMap;

import com.hqyj.ssmtesttwo.modal.Train;

public interface TrainService {
	
	HashMap<String,Object> selectAllTrain(Train t);
	
	boolean add(Train t);
	
	boolean update(Train t);
	
	boolean del(Integer id);
}
