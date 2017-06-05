package com.productstore.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("restClient")
public class RestClient {
	@Autowired
	private RestTemplate restTemplate;
	
	public String addOrder(){
		return restTemplate.getForObject("http://localhost:8080/product/order", String.class);
	}

}
