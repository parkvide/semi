package com.kh.app.admin.movie.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.movie.vo.MovieVo;
import com.kh.app.admin.movie.vo.PageVo;
import com.kh.app.admin.vo.AdminVo;
import com.kh.app.admin.movie.dao.MovieDao;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

public class MovieService {
	

	private MovieDao dao;
	
	public MovieService() {
		this.dao = new MovieDao();
	}

	public int insert(MovieVo vo) throws Exception {
		
		SqlSession ss = getSqlSession();
		int result = dao.insert(ss , vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		
		return result;
	}


	public int edit(MovieVo vo) throws Exception {

		SqlSession ss = getSqlSession();
		int result = dao.edit(ss, vo);
		
		if(result == 1){
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
	
	}

	public int getMovieCnt() throws Exception {

		SqlSession ss = getSqlSession();
		int cnt = dao.getMovieCnt(ss);

		ss.close();
		
		return cnt;
	}

	public List<MovieVo> selectMovieList(PageVo pvo) throws Exception{

		SqlSession ss = getSqlSession();
		List<MovieVo> voList = dao.selectMovieList(ss , pvo);
		
		ss.commit();
		
		return voList;
		
	}

	public AdminVo getMovieByNo(String no, boolean isSelf) throws Exception {

		SqlSession ss = null;
		MovieVo vo = null;
		
		try {
			ss = getSqlSession();
			
			int result = 1;
			if(!isSelf) {
				result = dao.increaseHit(ss, no);
			}
			
			vo = dao.getMovieByNo(ss, no);
			if(result == 1 && vo != null) {
				ss.commit();
			}else {
				ss.rollback();
				throw new Exception("[ERROR-B001]게시글 조회수 증가 실패 ...");
			}
		}finally {
			ss.close();
		}
	
		
		return null;
	}

}
