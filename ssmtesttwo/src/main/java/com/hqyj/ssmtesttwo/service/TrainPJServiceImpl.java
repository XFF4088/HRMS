package com.hqyj.ssmtesttwo.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.ssmtesttwo.dao.TrainDao;
import com.hqyj.ssmtesttwo.dao.TrainPJDao;
import com.hqyj.ssmtesttwo.modal.Train;
import com.hqyj.ssmtesttwo.modal.TrainPJ;

@Service
public class TrainPJServiceImpl implements TrainPJService{
	
	@Autowired
	TrainPJDao trainPJDao;
	
	@Override
	public HashMap<String,Object>  selectTrainPJ(TrainPJ tp) {
		HashMap<String,Object>  map = new HashMap<String,Object> ();

		if(tp.getStudent().getsName()!=null&&!tp.getStudent().getsName().equals("")){
			tp.getStudent().setsName("%"+tp.getStudent().getsName()+"%");
		}
		
		int start = tp.getRows()*(tp.getPage()-1);
		tp.setStart(start);	
		int total = trainPJDao.selectCount(tp);
		map.put("rows", trainPJDao.selectTrainPJ(tp));
		map.put("total", total);
		return map;
	}

	

	@Override
	public boolean update(Train t) {
		/*
		 * if(trainPJDao.update(t)>0) { return true; }
		 */
		return false;
	}


}
