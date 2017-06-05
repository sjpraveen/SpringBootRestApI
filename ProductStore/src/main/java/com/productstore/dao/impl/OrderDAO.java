package com.productstore.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.productstore.dao.IOrderDAO;
import com.productstore.entity.Order;

@Repository
@Transactional
public class OrderDAO{
	
	@PersistenceContext(unitName = "entityM")
	private EntityManager entityManager;

	
	public String addOrder(Order order) {
		
		entityManager.persist(order);
		return "PRID0" +order.getId();
	}	
	
	

}
