package com.productstore.dao;

import org.springframework.stereotype.Service;

import com.productstore.entity.Order;
@Service
public interface IOrderDAO {
	
	//List<Order> getAllOrders();
	//Order getArticleById(int orderId);
    String addOrder(Order order);
   // void updateArticle(Order order);
  //  void deleteArticle(int orderId);
   

}
