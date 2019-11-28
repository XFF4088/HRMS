package com.hqyj.ssmtesttwo.dao;

import java.util.List;

import com.hqyj.ssmtesttwo.modal.Train;

public interface TrainDao {
	
	//查询
	List<Train> selectAllTrain(Train t);
	
	//查询总条数
	int selectCount(Train t);
	
	//新增
	int add(Train t);
	
	//修改
	int update(Train t);
	
	//刪除
	int del(Integer id);
}
