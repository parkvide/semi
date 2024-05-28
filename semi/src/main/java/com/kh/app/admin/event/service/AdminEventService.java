package com.kh.app.admin.event.service;

import com.kh.app.admin.event.dao.AdminEventDao;
import com.kh.app.admin.event.vo.AdminEventVo;

import oracle.jdbc.proxy.annotation.GetCreator;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

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

	public List<AdminEventVo> list() throws Exception {
		SqlSession ss = getSqlSession();
		List<AdminEventVo> voList = dao.list(ss);
		
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

	public int edit(AdminEventVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.edit(ss, vo);
		
		if(result == 1) {
			ss.commit();
			
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
	
	}

}
