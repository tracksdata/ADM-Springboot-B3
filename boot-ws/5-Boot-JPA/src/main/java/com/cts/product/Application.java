package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		Product product=new Product();
		product.setId(10);
		product.setName("Mobile");
		product.setDescription("Samsung A7");
		product.setPrice(55000);
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		ProductService ps = ac.getBean(ProductService.class);
		
		ps.save(product);
		
		
	}

}
