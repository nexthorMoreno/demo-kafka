package com.tharmony.producer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
	@Bean
	CommandLineRunner init(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("news", "Hi new topic for Sports2 from Spring Boot");
		};
	}

}
