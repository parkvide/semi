package com.kh.app.admin.store.dao;

import java.util.List;

import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.store.vo.AdminStoreVo;

public class AdminStoreDao {

	public int insert(SqlSession ss, AdminStoreVo vo) {

		return ss.insert("AdminMapper.storeInsert" , vo);
	}

	  public List<AdminStoreVo> list(SqlSession ss) {
	        return ss.selectList("AdminMapper.storeList");
	    }

	public int delete(SqlSession ss, String no) {
		return ss.update("AdminMapper.storeDelete", no);
	}

	public int edit(SqlSession ss ,AdminStoreVo vo) {
		return ss.update("AdminMapper.storeEdit" , vo);
	}

	public AdminStoreVo selectOne(SqlSession ss, String no) {
		return ss.selectOne("AdminMapper.storeSelectOne" , no);
	}

}
