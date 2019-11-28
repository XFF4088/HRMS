package com.hqyj.ssmtesttwo.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.ssmtesttwo.dao.TrainDao;
import com.hqyj.ssmtesttwo.modal.Train;

@Service
public class TrainServiceImpl implements TrainService{
	
	@Autowired
	TrainDao trainDao;
	
	@Override
	public HashMap<String,Object>  selectAllTrain(Train t) {
		HashMap<String,Object>  map = new HashMap<String,Object> ();

		if(t.getName()!=null&&!t.getName().equals("")){
			t.setName("%"+t.getName()+"%");
		}
		System.err.println("错误信息："+t.toString());
		
		int start = t.getRows()*(t.getPage()-1);
		t.setStart(start);	
		int total = trainDao.selectCount(t);
		map.put("rows", trainDao.selectAllTrain(t));
		map.put("total", total);
		return map;
	}

	@Override
	public boolean add(Train t) {
		if(trainDao.add(t)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Train t) {
		if(trainDao.update(t)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean del(Integer id) {
		if(trainDao.del(id)>0) {
			return true;
		}
		return false;
	}

}
