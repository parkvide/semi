package com.kh.app.store.vo;

public class ProductVo {

	private String no;
	private String categoryNo;
	private String name;
	private String price;
	private String originCountry;
	private String nutrienteImg;
	private String productImg;
	private String delYn;
	private String detail;
	private String type;
	public ProductVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductVo(String no, String categoryNo, String name, String price, String originCountry, String nutrienteImg,
			String productImg, String delYn, String detail, String type) {
		super();
		this.no = no;
		this.categoryNo = categoryNo;
		this.name = name;
		this.price = price;
		this.originCountry = originCountry;
		this.nutrienteImg = nutrienteImg;
		this.productImg = productImg;
		this.delYn = delYn;
		this.detail = detail;
		this.type = type;
	}
	@Override
	public String toString() {
		return "ProductVo [no=" + no + ", categoryNo=" + categoryNo + ", name=" + name + ", price=" + price
				+ ", originCountry=" + originCountry + ", nutrienteImg=" + nutrienteImg + ", productImg=" + productImg
				+ ", delYn=" + delYn + ", detail=" + detail + ", type=" + type + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
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
	public String getOriginCountry() {
		return originCountry;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	public String getNutrienteImg() {
		return nutrienteImg;
	}
	public void setNutrienteImg(String nutrienteImg) {
		this.nutrienteImg = nutrienteImg;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
