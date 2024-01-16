package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public Product saveProduct(Product product) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

		return product;
	}

	public Product updateProductById(Product product) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		return product;
	}

	public boolean deleteById(int id) {
		entityTransaction = entityManager.getTransaction();
		Product product = entityManager.find(Product.class, id);
		if (product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
		}

		return false;
	}

	public Product validateProduct(int id, String name) {
		String sql = "select pro from Product pro where pro.id=?1 and pro.name=?2";
		Query query = entityManager.createQuery(sql);
		List<Product> product = query.getResultList();
		if (product.isEmpty()) {
			return null;
		} else {
			return product.get(0);
		}
	}

	

	public List<Product> getAllProduct() {
		String sql = "select pro from Product pro";
		Query query = entityManager.createQuery(sql);
		List list = query.getResultList();
		if (list != null) {
			return list;
		} else {
			return null;
		}

	}

	public List<Product> getProductByName(String name) {
		String sql = "select pro from Product pro where pro.price=?1 ";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		List<Product> list = query.getResultList();
		if (list != null) {
			return list;
		}else {
			return null;
		}
	}

	public Product getProductById(int id) {
		Product product = entityManager.find(Product.class, id);
		if (product != null) {
			return product;
		}else {
			return null;
		}
	}

	public List<Product> getProductByBrand(String brand) {
		String sql = "select pro from Product pro where pro.price=?1 ";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, brand);
		List<Product> list = query.getResultList();
		if (list != null) {
			return list;
		}else {
			return null;
		}
	}

	public List<Product> getProductByPrice(double price) {
		String sql = "select pro from Product pro where pro.price=?1 ";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, price);
		List<Product> list = query.getResultList();
		if (list != null) {
			return list;
		}else {
			return null;
		}
	}

	public Product getProductByType(String type) {

		Product product = entityManager.find(Product.class, type);
		if (product != null) {
			return product;
		}else {
			return null;
		}
	}

	public List<Product> getProductBySize(String size) {
		String sql = "select pro from Product pro where pro.price=?1 ";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, size);
		List<Product> list = query.getResultList();
		if (list != null) {
			return list;
		}else {
			return null;
		}
	}

	public List<Product> getProductByRating(String name,String brand) {
		String sql = "select pro from Product pro where pro.price=?1 and pro.brand=?2 ";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, brand);
		List<Product> list = query.getResultList();
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

}
