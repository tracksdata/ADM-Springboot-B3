package com;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class C5 {

	@Bean
	public void f5() {
		System.out.println("--- C5 class f5 method <<<< == >>>>");
	}
}
