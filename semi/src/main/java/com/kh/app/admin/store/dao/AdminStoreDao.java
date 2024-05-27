package com.kh.app.admin.store.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.store.vo.AdminStoreVo;

public class AdminStoreDao {

	public int insert(SqlSession ss, AdminStoreVo vo) {

		return ss.insert("AdminMapper.storeInsert" , vo);
	}

	  public List<AdminStoreVo> getAllProducts(SqlSession ss) {
	        return ss.selectList("AdminMapper.getAllProducts");
	    }

	public int delete(SqlSession ss, String no) {
		// TODO Auto-generated method stub
		return 0;
	}

}
