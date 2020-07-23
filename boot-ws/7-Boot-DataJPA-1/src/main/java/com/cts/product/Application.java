package com.cts.product;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Application.class, args);
		
		ProductDao prodDao = ac.getBean(ProductDao.class);
		
		Product p1=new Product("Pen","Red Ink",34);
		Product p2=new Product("Book","100 Pages Ink",374);
		Product p3=new Product("Laptop","Intel I7",65000);
		Product p4=new Product("Mouse","Dell Wireless",4500);
		Product p5=new Product("Mobile","Apple",85000);
		
		//prodDao.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
	/*
		prodDao.findAll().forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getDescription());
			System.out.println("---------------------------------");
		});
		
		
	*/
		
		/*
		
		Product product=prodDao.findById(2).orElse(null);
		
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getDescription());
		System.out.println(product.getPrice());
		System.out.println("---------------------------------");
		
		
		product.setDescription("100 Pages white Note Book");
		
		prodDao.save(product);
		
		//prodDao.delete(product);
		//prodDao.deleteById(2);
		
		*/
		
		
		/*
		prodDao.findByNameLike("%o%").forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getDescription());
			System.out.println("---------------------------------");
		});
		
		*/
		
		
		/*
		prodDao.findByPriceBetween(50000, 90000).forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("---------------------------------");
		});
		
		*/
		
		/*
		List<Product> prods=prodDao.findAll();
		Collections.sort(prods);
		
		prods.forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("---------------------------------");
		});
		
		*/
		
		List<Product> prods=prodDao.findAll();
		Collections.sort(prods,new Product());
		
		System.out.println("Sort by name");
		prods.forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("---------------------------------");
		});
		
		
		
		
		
		
		
	}

}
