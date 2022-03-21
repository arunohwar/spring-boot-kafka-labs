package com.springboot.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	private  Producer producer;

	@Autowired
	public void KafkaController(Producer producer) {
		this.producer = producer;
	}

	@GetMapping(value = "/publish")
	public String sendMessageToKafkaTopic(@RequestParam(value = "message", defaultValue = "World") String message){
		
		System.out.println("Publish is called");
		this.producer.sendMessage(message);
		
		return "success";
	}

}

