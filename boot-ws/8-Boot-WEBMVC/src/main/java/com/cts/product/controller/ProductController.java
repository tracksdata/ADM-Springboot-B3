package com.cts.product.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@RequestMapping("/s1")
	public void f1() {
		System.out.println("---- f1 method of ProductController");
	}
	
	
	@RequestMapping(value = "/s2",method = RequestMethod.GET)
	public String f2(Model data) {
		data.addAttribute("cityName", "Chennai");
		System.out.println("---- f1 method of ProductController");
		return "test";
	}
	
}
