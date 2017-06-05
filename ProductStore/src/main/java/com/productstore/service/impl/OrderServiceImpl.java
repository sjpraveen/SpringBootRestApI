package com.productstore.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productstore.dao.impl.OrderDAO;
import com.productstore.entity.Order;
import com.productstore.service.IOrderService;
@Service
@Transactional
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private OrderDAO orderDao;

	@Override
	public String addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.addOrder(order);
	}

}
