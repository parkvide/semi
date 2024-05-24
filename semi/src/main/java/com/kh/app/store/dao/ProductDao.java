package com.kh.app.store.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.store.vo.ProductVo;

public class ProductDao {

	public List<ProductVo> selectPopList(SqlSession ss) {
		return ss.selectList("ProductMapper.selectPopList");
	}

	public List<ProductVo> selectPackList(SqlSession ss) {
		return ss.selectList("ProductMapper.selectPackList");
	}

}
