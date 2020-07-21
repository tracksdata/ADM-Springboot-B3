package com.cts.product.dao;

import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Override
	public Product save(Product product) {
		// code for saving product in db
		System.out.println("DAO: Saving "+product.getId()+" in database");
		return product;
	}

	@Override
	public Stream<Product> findAll() {
		return null;
	}

	@Override
	public Product findById(int id) {
		return null;
	}
	
	
	

}
