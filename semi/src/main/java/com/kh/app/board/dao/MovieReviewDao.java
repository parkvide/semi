package com.kh.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.ReviewVo;

public class MovieReviewDao {

	public List<ReviewVo> selectReviewByMovieNo(SqlSession ss, String movieNo) {
		return ss.selectList("MovieReviewMapper.selectReviewByMovieNo",movieNo);
	}

	public int writeReply(SqlSession ss, ReviewVo reviewVo) {
		return ss.insert("MovieReviewMapper.writeReply" , reviewVo);
	}

}
