package com.ynovb3.demoapi.service;

import org.springframework.stereotype.Service;

import com.ynovb3.demoapi.model.Product;

@Service //@Service permet de demander à Spring d'instancier cette classe
public class ProductService {

	public Product createNewRandomProduct() {
		
		Product p = new Product();
		p.setName("random product");
		p.setDescription("Description of the product");
		p.setCost(10);
		
		return p;
	}
	
}
