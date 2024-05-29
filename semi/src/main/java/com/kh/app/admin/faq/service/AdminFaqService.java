package com.kh.app.admin.faq.service;

import com.kh.app.admin.faq.dao.AdminFaqDao;
import com.kh.app.admin.faq.vo.AdminFaqVo;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

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

	public List<AdminFaqVo> list() throws Exception {

		SqlSession ss = getSqlSession();
		List<AdminFaqVo> voList = dao.list(ss);
		
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

	public int edit(AdminFaqVo vo) throws Exception {
		
		SqlSession ss = getSqlSession();
		int result = dao.edit(ss,vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
	}

	

}
