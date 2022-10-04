package com.kafkaexample.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

	@KafkaListener(topics = "kafkaexample",groupId= "groupId")
	void listener(String data) {
		String y = Character.toString( 128_512 );
		System.out.println("Listener recieved: " + data+ " tada" + " y");
	}
}
