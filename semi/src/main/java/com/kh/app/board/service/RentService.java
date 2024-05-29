package com.kh.app.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.RentDao;
import com.kh.app.board.vo.RentVo;
import com.kh.app.db.SqlSessionTemplate;

public class RentService {

	private final RentDao dao;
	
	public RentService() {
		this.dao = new RentDao();
	}
	
	public List<RentVo> selectRentList() throws Exception {
		
		 SqlSession ss = SqlSessionTemplate.getSqlSession();
		 List<RentVo> voList= dao.selectRentList(ss);
		 ss.close();
		 
		 return voList;
		
	}

}
