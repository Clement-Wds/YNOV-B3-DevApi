package com.ynovb3.demoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Auto complétion CTRL + ESPACE

//le @ c'est une annotation
@RestController
public class HelloController {
	
	//Spécifier l'URL - ici requête GET
	@GetMapping("/helloworld")
	public String getHelloWorld() {
		return "Hello World";
	}
	
}