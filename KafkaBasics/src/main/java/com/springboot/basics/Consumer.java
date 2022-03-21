package com.springboot.basics;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;


@Service
public class Consumer {
	
	@KafkaListener(topics = "quickstart-events",  groupId = "group_id")
	public void consume(String message){
		System.out.println("Consuming the message = " + message);
	}

}
