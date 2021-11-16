package com.ynovb3.demoapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ynovb3.demoapi.model.Product;
import com.ynovb3.demoapi.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired //Instanciation par Spring -> vérification si la classe existe dans le contexte
	private ProductService service;
	
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@GetMapping("/product/{name}")
	public Product getProductByName(@PathVariable String name) {
		
		//Simulate the code wich load and existing product by his name
		Product p = new Product();
		p.setName(name);
		p.setDescription("Description of the product");
		p.setCost(10);
		//End simulation
		
		return p;
	}
	
	@GetMapping("/product")
	public List<Product> getProducts(){
		
		List<Product> list = new ArrayList<>();
		list.add(service.createNewRandomProduct());
		list.add(service.createNewRandomProduct());
		
		return list;
		
	}
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product product) {
		logger.info(
				product.getName() + " " +
				product.getDescription() + " " +
				product.getCost()
		);
	}

}
