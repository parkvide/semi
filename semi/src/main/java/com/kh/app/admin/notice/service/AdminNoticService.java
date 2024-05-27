package com.kh.app.admin.notice.service;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.faq.vo.AdminFaqVo;
import com.kh.app.admin.notice.dao.AdminNoticDao;

public class AdminNoticService {
	
	private final AdminNoticDao dao;
	
	public AdminNoticService() {
		this.dao = new AdminNoticDao();
	}
	

	public int insert(AdminFaqVo vo) throws Exception {

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
