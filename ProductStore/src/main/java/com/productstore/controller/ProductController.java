package com.productstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.productstore.entity.Order;
import com.productstore.service.IOrderService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private IOrderService orderService;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value="/order", method= RequestMethod.POST,produces="application/text", consumes="application/json")
	public ResponseEntity<String> addOrder(@RequestBody Order order1, UriComponentsBuilder builder) {
		        
             System.out.println("hiiiiiiiiiiiiiiiii");
            /* Order order = new Order();
             order.setOrderDate(new Date());
             order.setOrderStatus("Initial");
             
             Customer customer = new Customer();
             customer.setFirstName("Sam");
             customer.setLastName("Disilva");
              
             CardDetails cardDetails = new CardDetails();
             cardDetails.setCardHolderName("fsfsdfsfsf");
             cardDetails.setCardNumber("11111111111111111");
             cardDetails.setExpiryMonth("March");
             cardDetails.setCvv(123);
             cardDetails.setExpiryYear(2017);
             
             customer.setCardDetails(cardDetails);
             
             
             
             Address address = new Address();
             address.setAddressLine1("dsafsfsdfsdf");
             address.setCity("Toronto");
             address.setCountry("Canada");
             address.setState("Ontario");
             address.setZipcode("M9A4Y1");
             
             customer.setAddress(address);
             
             order.setCustomer(customer);
             Set<OrderDetail> orderDetailSet = new HashSet<OrderDetail>();
             
             OrderDetail detail = new OrderDetail();
             detail.setQuantity(1);
             detail.setProductId(123);
             
             OrderDetail detail1 = new OrderDetail();
             detail1.setQuantity(1);
             detail1.setProductId(125);
             
             orderDetailSet.add(detail1);
             orderDetailSet.add(detail);
             
             order.setOrderDetail(orderDetailSet);
             */
                  
             String orderId="orderId: " +orderService.addOrder(order1);
                
                return new ResponseEntity<String>(orderId, HttpStatus.OK);
	}
	
	

}
