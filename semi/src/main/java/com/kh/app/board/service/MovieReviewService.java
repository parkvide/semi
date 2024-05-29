package com.kh.app.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.MovieReviewDao;
import com.kh.app.board.vo.ReviewVo;
import static com.kh.app.db.SqlSessionTemplate.*;

public class MovieReviewService {

	private final MovieReviewDao dao;
	
	public MovieReviewService() {
		this.dao = new MovieReviewDao();
	}
	//리뷰 목록 조회
	public List<ReviewVo> selectReviewByMovieNo(String movieNo) throws Exception {
		SqlSession ss = getSqlSession();
		List<ReviewVo> reviewVoList = dao.selectReviewByMovieNo(ss,movieNo);
		ss.close();
		
		return reviewVoList;
		
	}
	//리뷰 작성
	public int writeReply(ReviewVo reviewVo) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.writeReply(ss , reviewVo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
	}

}
