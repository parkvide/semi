package com.kh.app.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.EventVo;
import com.kh.app.board.vo.FaqVo;
import com.kh.app.board.vo.NoticeVo;
import com.kh.app.board.vo.RentVo;
import static com.kh.app.db.SqlSessionTemplate.*;

public class BoardService {

	private final BoardDao dao;
	
	public BoardService() {
		this.dao = new BoardDao();
	}
	//이벤트 리스트
	public List<EventVo> selectEventList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<EventVo> voList = dao.selectEventList(ss);
		
		ss.close();
		
		return voList;
		
	}
	//Faq 리스트
	public List<FaqVo> selectFaqList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<FaqVo> voList = dao.selectFaqList(ss);
		
		ss.close();
		
		return voList;
		
	}
	//공지사항 리스트
	public List<NoticeVo> getNoticeList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<NoticeVo> voList = dao.getNoticeList(ss);
		ss.close();
		
		return voList;
	}
	//렌트 리스트
	public List<RentVo> selectRentList() throws Exception {
		
		 SqlSession ss = getSqlSession();
		 List<RentVo> voList= dao.selectRentList(ss);
		 ss.close();
		 
		 return voList;
		
	}
	//이벤트 상세확인
	public EventVo selectEventListByNo(String no) throws Exception {
		
		SqlSession ss = getSqlSession();
		Map<String, String> map = new HashMap<String, String>();
		map.put("no", no);
		map.put("type", "event");
		int result = dao.increaseHit(ss,map);
		EventVo eventVo = dao.selectEventListByNo(ss , no);
		
		if (result == 1 ) {
			ss.commit();
		} else {
			ss.rollback();
			if(result != 1) {
				throw new Exception("[ERROR-B001]게시글 조회수 증가 실패 ...");
			}else {
				throw new Exception("[ERROR-B002]게시글 상세조회 실패 ...");
			}
		}
		ss.close();
		
		return eventVo;
	}
	//faq 상세확인
	public FaqVo selectFaqListByNo(String no) throws Exception {
		
		SqlSession ss = getSqlSession();
		Map<String, String> map = new HashMap<String, String>();
		map.put("no", no);
		map.put("type", "faq");
		int result = dao.increaseHit(ss,map);
		FaqVo faqVo = dao.selectFaqListByNo(ss ,no);
		if (result == 1 ) {
			ss.commit();
		} else {
			ss.rollback();
			if(result != 1) {
				throw new Exception("[ERROR-B001]게시글 조회수 증가 실패 ...");
			}else {
				throw new Exception("[ERROR-B002]게시글 상세조회 실패 ...");
			}
		}
		ss.close();
		return faqVo;
	}
	//notice 상세확인
	public NoticeVo selectNoticeListByNo(String no) throws Exception {
		
		SqlSession ss = getSqlSession();
		Map<String, String> map = new HashMap<String, String>();
		map.put("no", no);
		map.put("type", "notice");
		int result = dao.increaseHit(ss,map);
		NoticeVo noticeVo = dao.selectNoticeListByNo(ss,no);
		if (result == 1 ) {
			ss.commit();
		} else {
			ss.rollback();
			if(result != 1) {
				throw new Exception("[ERROR-B001]게시글 조회수 증가 실패 ...");
			}else {
				throw new Exception("[ERROR-B002]게시글 상세조회 실패 ...");
			}
		}
		ss.close();
		return noticeVo;
		
	}
	//rent 상세확인
	public RentVo selectRentListByNo(String no) throws Exception {
		
		SqlSession ss = getSqlSession();
		Map<String, String> map = new HashMap<String, String>();
		map.put("no", no);
		map.put("type", "rent");
		int result = dao.increaseHit(ss,map);
		RentVo rentVo = dao.selectRentListByNo(ss, no);
		if (result == 1 ) {
			ss.commit();
		} else {
			ss.rollback();
			if(result != 1) {
				throw new Exception("[ERROR-B001]게시글 조회수 증가 실패 ...");
			}else {
				throw new Exception("[ERROR-B002]게시글 상세조회 실패 ...");
			}
		}
		ss.close();
		
		return rentVo;
	}
	
	//회원 대관 insert
	public int insertRent(RentVo rentVo) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.insertRent(ss, rentVo);
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
	}

}

// ${VO.M.ID}
