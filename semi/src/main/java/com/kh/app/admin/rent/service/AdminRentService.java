package com.kh.app.admin.rent.service;

import com.kh.app.admin.rent.dao.AdminRentDao;
import com.kh.app.admin.rent.vo.AdminRentVo;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


public class AdminRentService {
	
	private final AdminRentDao dao;
	
	public AdminRentService() {
		this.dao = new AdminRentDao();
	}

	
	
	public List<AdminRentVo> list() throws Exception{
		
		SqlSession ss = getSqlSession();
		List<AdminRentVo> voList = dao.list(ss);
		
		ss.close();
		return voList;
		
	}
	//답변달기
	public int answerUpdate(AdminRentVo adminRentVo) throws Exception {
		
		SqlSession ss = getSqlSession();
		int result = dao.answerUpdate(ss, adminRentVo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
	}

	//화면에 특정값 가져가기
	public List<AdminRentVo> selectList(String no) throws Exception {
		SqlSession ss = getSqlSession();
		List<AdminRentVo> adminVoList = dao.selectList(ss, no);
		
		ss.close();
		return adminVoList;
	}



}
