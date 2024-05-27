package com.kh.app.admin.theater.service;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.theater.dao.AdminTheaterDao;
import com.kh.app.admin.theater.vo.AdminTheaterVo;

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

}
