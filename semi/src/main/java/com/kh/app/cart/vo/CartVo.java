package com.kh.app.cart.vo;

import java.util.Objects;

public class CartVo {
	
	private String no;
	private String memNo;
	private String productNo;
	private String quantity;
	private String name;
	private String price;
	private String productImg;
	private String detail;
	public CartVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartVo(String memNo, String productNo, String quantity) {
		super();
		this.memNo = memNo;
		this.productNo = productNo;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", memNo=" + memNo + ", productNo=" + productNo + ", quantity=" + quantity
				+ ", name=" + name + ", price=" + price + ", productImg=" + productImg + ", detail=" + detail + "]";
	}
	public CartVo(String no, String memNo, String productNo, String quantity, String name, String price,
			String productImg, String detail) {
		super();
		this.no = no;
		this.memNo = memNo;
		this.productNo = productNo;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		this.productImg = productImg;
		this.detail = detail;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
}
