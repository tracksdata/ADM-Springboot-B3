package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

	List<Product> findByNameLike(String s1);
	List<Product> findByPriceBetween(double startPrice,double endPrice);
	
	
}