package com.cts.product.service;

import java.util.stream.Stream;

import com.cts.product.model.Product;

public interface ProductService {
	Product save(Product product);

	Stream<Product> findAll();

	Product findById(int id);
}
