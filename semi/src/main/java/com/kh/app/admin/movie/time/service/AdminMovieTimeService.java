package com.kh.app.admin.movie.time.service;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.movie.time.dao.AdminMovieTimeDao;
import com.kh.app.admin.movie.time.vo.AdminMovieTimeVo;

public class AdminMovieTimeService {

	private final AdminMovieTimeDao dao;
	
	public AdminMovieTimeService() {
		this.dao = new AdminMovieTimeDao();
	}
	
	public int insert() throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.insert(ss);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
	}

	public List<AdminMovieTimeVo> list() throws Exception {
		SqlSession ss = getSqlSession();
		List<AdminMovieTimeVo>  voList = dao.list(ss);
		
		ss.close();
		
		return voList;
	}

	public List<AdminMovieTimeVo> edit(String no) {
		return null;
	}


}
