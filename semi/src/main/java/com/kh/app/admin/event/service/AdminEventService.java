package com.kh.app.admin.event.service;

import com.kh.app.admin.event.dao.AdminEventDao;
import com.kh.app.admin.event.dao.AdminEventVo;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class AdminEventService {

	private AdminEventDao dao;
	
	public AdminEventService() {
		this.dao = new AdminEventDao();
	}
	
	public int insert(AdminEventVo vo) throws Exception {
		
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
