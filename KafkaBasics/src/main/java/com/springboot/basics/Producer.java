package com.springboot.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	private static final String TOPIC = "quickstart-events";


	public void sendMessage(String message){
		//logger.info(String.format("$$$ -> Producing message --> %s",message));
		System.out.println("Producing the message = " + message);
		this.kafkaTemplate.send(TOPIC,message);
		}

}
