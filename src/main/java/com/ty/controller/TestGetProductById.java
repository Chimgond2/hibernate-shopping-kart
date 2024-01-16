package com.ty.controller;

import com.ty.service.ProductService;
import com.ty.shopping.dto.Product;

public class TestGetProductById {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product=productService.getProductById(7);
		System.out.println(product.getDescription());
	}

}
