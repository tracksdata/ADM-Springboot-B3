package com.cts.product.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return prodDao.save(product);
	}

	@Override
	public Stream<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

}
