package com.kh.app.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.EventVo;
import com.kh.app.board.vo.FaqVo;
import com.kh.app.board.vo.NoticeVo;
import com.kh.app.board.vo.RentVo;

public class BoardDao {

	// 이벤트 조회
	public List<EventVo> selectEventList(SqlSession ss) {

		return ss.selectList("BoardMapper.selectEventList");

	}

	// Faq 조회
	public List<FaqVo> selectFaqList(SqlSession ss) {
		return ss.selectList("BoardMapper.selectFaqList");
	}

	// 공지사항 목록 조회
	public List<NoticeVo> getNoticeList(SqlSession ss) {

		return ss.selectList("BoardMapper.selectNoticeList");
	}

	// 렌트 조회
	public List<RentVo> selectRentList(SqlSession ss) {
		return ss.selectList("BoardMapper.selectRentList");
	}
	//이벤트 상세조회
	public EventVo selectEventListByNo(SqlSession ss, String no) {
		return ss.selectOne("BoardMapper.selectEventListByNo" , no);
	}

	//faq 상세조회
	public FaqVo selectFaqListByNo(SqlSession ss, String no) {
		return ss.selectOne("BoardMapper.selectFaqListByNo" , no);
	}

	//notice 상세조회
	public NoticeVo selectNoticeListByNo(SqlSession ss, String no) {
		return ss.selectOne("BoardMapper.selectNoticeListByNo", no);
	}

	//rent 상세조회
	public RentVo selectRentListByNo(SqlSession ss, String no) {
		return ss.selectOne("BoardMapper.selectRentListByNo",no);
	}

	public int increaseHit(SqlSession ss, Map<String, String> map) {
		
		return ss.update("BoardMapper.increaseHit",map);
	}

	//rent insert
	public int insertRent(SqlSession ss, RentVo rentVo) {
		return ss.insert("BoardMapper.insertRent" ,rentVo);
	}
}

