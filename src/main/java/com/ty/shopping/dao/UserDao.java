package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.User;

public class UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = null;

	public User saveUser(User user) {

		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		return user;
	}

	public User getUserById(int id) {

		User user = entityManager.find(User.class, id);

		if (user != null) {
			return user;
		} else {
			return null;
		}

	}

	public List<User> getAllUser() {

		String sql = "select y from User y ";
		Query query = entityManager.createQuery(sql);
		List list = query.getResultList();
		if (list != null) {
			return list;
		} else {

			return null;
		}
	}

	public User validateUser(String email, String password) {

		String sql = "select q from User q where q.email=?1 and q.password=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User> user = query.getResultList();
		if (user.isEmpty()) {
			return null;
		} else {
			return user.get(0);
		}
	}

	public boolean deleteUserById(int id) {
		entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, id);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}

	}

	public User updateUserById(User user) {
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		return user;
	}
	public void getUserByName() {
		
	}

}
