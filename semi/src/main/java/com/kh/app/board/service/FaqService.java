package com.kh.app.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.FaqDao;
import com.kh.app.board.vo.FaqVo;
import com.kh.app.db.SqlSessionTemplate;

public class FaqService {

	private final FaqDao dao;
	
	public FaqService() {
		this.dao = new FaqDao();
	}
	
	//Faq 조회
	public List<FaqVo> selectFaqList() throws Exception {
		
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		List<FaqVo> voList = dao.selectFaqList(ss);
		
		ss.close();
		
		return voList;
		
	}
	
	// Faq작성 

}
