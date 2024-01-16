package com.ty.controller;

import com.ty.service.ProductService;
import com.ty.shopping.dto.Product;
import com.ty.shopping_kart.util.AES;

public class TestSaveProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product=new Product();
		
		product.setName("1100 model");
		product.setBrand("nokia");
		product.setPrice(10000);
		product.setType("electronics");
		product.setRating("3.0");
		//product.setSize("3");
		product.setDescription("4 gb ram and 64 gb internal storage");
		
		productService.saveProduct(product);
		if(product!=null) {
			System.out.println("product added");
		}
		else {
			System.out.println("product is not added"); 
		}
	}

}
