package com.kh.app.admin.movie.service;

import com.kh.app.admin.movie.dao.AdminMovieDao;
import com.kh.app.admin.movie.vo.AdminMovieVo;
import com.kh.app.db.SqlSessionTemplate;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class AdminMovieService {

	private final AdminMovieDao dao;
	
	public AdminMovieService() {
		this.dao =new AdminMovieDao();
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

}
