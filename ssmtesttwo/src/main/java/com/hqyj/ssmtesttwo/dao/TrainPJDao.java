package com.hqyj.ssmtesttwo.dao;

import java.util.List;

import com.hqyj.ssmtesttwo.modal.Train;
import com.hqyj.ssmtesttwo.modal.TrainPJ;

public interface TrainPJDao {
	
	//查询
	List<TrainPJ> selectTrainPJ(TrainPJ tp);
	
	//查询总条数
	int selectCount(TrainPJ tp);
	
	
}
