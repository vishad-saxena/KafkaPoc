package com.vishad.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaWithSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaWithSpringbootApplication.class, args);
	}

}
