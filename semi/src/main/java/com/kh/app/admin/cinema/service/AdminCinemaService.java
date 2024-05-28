package com.kh.app.admin.cinema.service;

import com.kh.app.admin.cinema.dao.AdminCinemaDao;
import com.kh.app.admin.cinema.vo.AdminCinemaVo;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class AdminCinemaService {

	private final AdminCinemaDao dao;
	
	public AdminCinemaService() {
		this.dao = new AdminCinemaDao();
	}
	
	public int insert(AdminCinemaVo vo) throws Exception {
		
		SqlSession ss = getSqlSession();
		
		int result = dao.insert(ss, vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
	
	}

	public List<AdminCinemaVo> list() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<AdminCinemaVo> voList = dao.list(ss);
		
		ss.close();
		return voList;
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

}
