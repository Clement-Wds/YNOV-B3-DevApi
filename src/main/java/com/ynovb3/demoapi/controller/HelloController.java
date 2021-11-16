package com.ynovb3.demoapi.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//Auto complétion CTRL + ESPACE

//le @ c'est une annotation
@RestController
public class HelloController {
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(HelloController.class);
	
	//Spécifier l'URL - ici requête GET
	//récupération de tous
	@GetMapping("/helloworld")
	public String getHelloWorld() {
		return "Hello World";
	}
	
	//Récupération de 1
	@GetMapping("/helloworld/{str}")
	public String getHelloWorldWithParam(@PathVariable("str") String str) {
		return "Get the value : " + str;
	}
	
	//Envoie de 1
	@PostMapping("/helloworld")
	public void postHelloWorld(@RequestBody String str) {
		//Générer des traces dans la console
		logger.info("Received : " + str);
	}
	
	//Suppression de 1
	@DeleteMapping("/helloworld/{id}")
	public void deleteHelloWorld(@PathVariable("id") Integer id) {
		logger.info("DeleteHelloWorld endpoint called for id : " + id);
	}
}
