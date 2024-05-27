package com.kh.app.cart.vo;

public class CartVo {
	
	private String no;
	private String memNo;
	private String productNo;
	private int quantity;
	public CartVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartVo(String no, String memNo, String productNo, int quantity) {
		super();
		this.no = no;
		this.memNo = memNo;
		this.productNo = productNo;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", memNo=" + memNo + ", productNo=" + productNo + ", quantity=" + quantity + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMemNo() {
		return memNo;
	}
	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
