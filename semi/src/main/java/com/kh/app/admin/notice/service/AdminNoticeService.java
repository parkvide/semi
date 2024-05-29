package com.kh.app.admin.notice.service;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.faq.vo.AdminFaqVo;
import com.kh.app.admin.notice.dao.AdminNoticeDao;
import com.kh.app.admin.notice.vo.AdminNoticeVo;

public class AdminNoticeService {
	
	private final AdminNoticeDao dao;
	
	public AdminNoticeService() {
		this.dao = new AdminNoticeDao();
	}
	

	public int insert(AdminNoticeVo vo) throws Exception {

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


	public List<AdminNoticeVo> list() throws Exception {
		SqlSession ss = getSqlSession();
		List<AdminNoticeVo> voList = dao.list(ss);
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


	public int edit(AdminNoticeVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.edit(ss , vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
		
		
		
	}

}
