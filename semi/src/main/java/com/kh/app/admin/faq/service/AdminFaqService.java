package com.kh.app.admin.faq.service;

import com.kh.app.admin.faq.dao.AdminFaqDao;
import com.kh.app.admin.faq.vo.AdminFaqVo;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class AdminFaqService {

	private final AdminFaqDao dao;
	
	public AdminFaqService() {
		this.dao = new AdminFaqDao();
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
