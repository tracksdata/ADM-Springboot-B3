package com.cts.product.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class C2 {
	@Bean
	public void f2() {
		System.out.println("--- C2 class f2 method");
	}
}
