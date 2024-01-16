package com.ty.service;

import java.util.List;

import com.ty.shopping.dao.ProductDao;
import com.ty.shopping.dto.Product;
import com.ty.shopping_kart.util.AES;
import static com.ty.shopping_kart.util.AppConstants.SECRET_KEY;

public class ProductService {
	ProductDao productDao = new ProductDao();

	public Product saveProduct(Product product) {
		String enc=AES.encrypt(product.getDescription(), SECRET_KEY);
		product.setDescription(enc);
		return productDao.saveProduct(product);

	}

	public Product updateProductById(Product product) {
		return productDao.updateProductById(product);
	}

	public boolean deleteById(int id) {
		return productDao.deleteById(id);
	}

	public Product validateProduct(int id, String name) {
		return productDao.validateProduct(id, name);
	}

	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}

	public List<Product> getProductByName(String name) {
		return productDao.getProductByName(name);
	}

	public Product getProductById(int id) {
		ProductDao productDao = new ProductDao();

		Product product = productDao.getProductById(id);
		String dec = AES.decrypt(product.getDescription(), SECRET_KEY);
		product.setDescription(dec);
		return product;
	}

	public List<Product> getProductByBrand(String brand) {
		return productDao.getProductByBrand(brand);
	}

	public List<Product> getProductByPrice(double price) {
		return productDao.getProductByPrice(price);
	}

	public Product getProductByType(String type) {
		return productDao.getProductByType(type);
	}

	public List<Product> getProductBySize(String size) {
		return productDao.getProductBySize(size);
	}

	public void getProductByRating(String name,String brand) {
		List<Product> products= productDao.getProductByRating(name,brand);
	}

}
