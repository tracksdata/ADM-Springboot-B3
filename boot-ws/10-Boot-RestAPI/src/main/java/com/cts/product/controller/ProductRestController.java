package com.cts.product.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	
	@GetMapping
	public String f1() {
		return "GET Mapping";
	}
	@PostMapping
	public String f2() {
		return "POST Mapping";
	}
	@PutMapping
	public String f3() {
		return "PUT Mapping";
	}
	@PatchMapping
	public String f4() {
		return "PATCH Mapping";
	}
	@DeleteMapping
	public String f5() {
		return "DELETE Mapping";
	}
	
	

}
