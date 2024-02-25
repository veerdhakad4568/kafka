package com.kafkaflow.myeventproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyEventProducerApplication {

	public static void main(String[] args) {


		System.setProperty("server.port", "8082");
		SpringApplication.run(MyEventProducerApplication.class, args);
	}

}
