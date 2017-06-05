package com.productstore.starter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.client.RestTemplate;

import com.productstore.client.RestClient;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@ImportResource("classpath:spring-context.xml")
public class ProductConfig implements CommandLineRunner {	
	public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(ProductConfig.class, args);
       System.out.println(((RestClient)context.getBean("restClient")).addOrder());
    }
	

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Bean
	public RestTemplate geRestTemplate(){
		return new RestTemplate();
	}

}
