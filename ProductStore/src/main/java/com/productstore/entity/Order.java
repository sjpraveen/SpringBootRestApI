package com.productstore.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_order")
public class Order  {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int id;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "order_status")
	private String orderStatus;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private Set<OrderDetail> orderDetail;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	



	public Date getOrderDate() {
		return new Date();
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	
	public Set<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(Set<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
