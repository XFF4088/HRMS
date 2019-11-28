package com.hqyj.ssmtesttwo.service;

import java.util.HashMap;

import com.hqyj.ssmtesttwo.modal.Train;
import com.hqyj.ssmtesttwo.modal.TrainPJ;

public interface TrainPJService {
	
	HashMap<String,Object> selectTrainPJ(TrainPJ tp);
	
	
	boolean update(Train t);
	
}
