package com.kh.app.admin.theater.service;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.theater.dao.AdminTheaterDao;
import com.kh.app.admin.theater.vo.AdminTheaterVo;
import com.kh.app.db.SqlSessionTemplate;

public class AdminTheaterService {
	
	private final AdminTheaterDao dao;
	
	public AdminTheaterService() {
		this.dao = new AdminTheaterDao();
	}

	public int insert(AdminTheaterVo vo) throws Exception {
		
		SqlSession ss = getSqlSession();
		 int result = dao.insert(ss,vo);
		 
		 if(result == 1) {
			 ss.commit();
		 }else {
			ss.rollback();
		}
		 ss.close();
		 
		
		return result;
	}

	public List<AdminTheaterVo> list() throws Exception {
		SqlSession ss = getSqlSession();
		List<AdminTheaterVo> theaterVoList = dao.list(ss);
		ss.close();
		return theaterVoList;
	}

	public int delete(String no) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.delete(ss, no);
		
		if(result == 1) {
			ss.commit();
		} else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

	public int edit(AdminTheaterVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.edit(ss, vo);
		if(result == 1) {
			ss.commit();
		} else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

	public AdminTheaterVo selectOne(String no) throws Exception {
		SqlSession ss = getSqlSession();
		AdminTheaterVo voList = (AdminTheaterVo)dao.selectOne(ss,no);
		
		ss.close();
		return voList;
	}


}
