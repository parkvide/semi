package com.kh.app.store.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static com.kh.app.db.SqlSessionTemplate.*;
import com.kh.app.store.dao.ProductDao;
import com.kh.app.store.vo.ProductVo;

public class ProductService {

	private final ProductDao dao;
	
	public ProductService() {
		this.dao = new ProductDao();
	}
	
	public List<ProductVo> selectPopList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<ProductVo> voList = dao.selectPopList(ss);
		
		ss.close();
		
		return voList;
		
	}

	public List<ProductVo> selectPackList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<ProductVo> voList = dao.selectPackList(ss);
		ss.close();
		
		return voList;
	}

}
