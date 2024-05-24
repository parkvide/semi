package com.kh.app.store.vo;

public class ProductVo {

	private String no;
	private String catrgoryNo;
	private String name;
	private String price;
	private String originCountry;
	private String nutrienteImg;
	private String productImg;
	private String delYn;
	public ProductVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductVo(String no, String catrgoryNo, String name, String price, String originCountry, String nutrienteImg,
			String productImg, String delYn) {
		super();
		this.no = no;
		this.catrgoryNo = catrgoryNo;
		this.name = name;
		this.price = price;
		this.originCountry = originCountry;
		this.nutrienteImg = nutrienteImg;
		this.productImg = productImg;
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "ProductVo [no=" + no + ", catrgoryNo=" + catrgoryNo + ", name=" + name + ", price=" + price
				+ ", originCountry=" + originCountry + ", nutrienteImg=" + nutrienteImg + ", productImg=" + productImg
				+ ", delYn=" + delYn + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCatrgoryNo() {
		return catrgoryNo;
	}
	public void setCatrgoryNo(String catrgoryNo) {
		this.catrgoryNo = catrgoryNo;
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
	
	
}
