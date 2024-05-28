package com.kh.app.admin.movie.service;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.movie.dao.AdminMovieDao;
import com.kh.app.admin.movie.vo.AdminMovieVo;
import com.kh.app.admin.service.AdminService;

public class AdminMovieService {

	private final AdminMovieDao dao;
	
	public AdminMovieService() {
		this.dao = new AdminMovieDao();
}
	
	public int insert(AdminMovieVo vo) throws Exception {
		
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

	public List<AdminMovieVo> list() throws Exception {
		SqlSession ss = getSqlSession();
		List<AdminMovieVo> voList =dao.list(ss);
		ss.close();
		return voList;
	}

	public int delete(String no) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.delete(ss , no);
		
		if(result == 1) {
			ss.commit();
		} else {
			ss.rollback();
		}
		ss.close();
		return result;
		
		
	}

	public int edit(AdminMovieVo vo) throws Exception {
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
