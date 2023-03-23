package com.example.demo.repository;

public class ResponseDto {
	private productcategoryDto productcategoryDto;
	private productsDto productsDto;
	public productcategoryDto getProductcategoryDto() {
		return productcategoryDto;
	}
	public void setProductcategoryDto(productcategoryDto productcategoryDto) {
		this.productcategoryDto = productcategoryDto;
	}
	public productsDto getProductsDto() {
		return productsDto;
	}
	public void setProductsDto(productsDto productsDto) {
		this.productsDto = productsDto;
	}
	public ResponseDto(com.example.demo.repository.productcategoryDto productcategoryDto,
			com.example.demo.repository.productsDto productsDto) {
		super();
		this.productcategoryDto = productcategoryDto;
		this.productsDto = productsDto;
	}
	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
