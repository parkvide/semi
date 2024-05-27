package com.kh.app.admin.cinema.service;

import com.kh.app.admin.cinema.dao.AdminCinemaDao;
import com.kh.app.admin.cinema.vo.AdminCinemaVo;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

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

}
