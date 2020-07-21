package com.cts.product.dao;

import java.util.stream.Stream;

import com.cts.product.model.Product;

public interface ProductDao {

	Product save(Product product);

	Stream<Product> findAll();

	Product findById(int id);

}