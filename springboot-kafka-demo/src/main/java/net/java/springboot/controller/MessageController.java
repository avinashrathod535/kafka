package net.java.springboot.controller;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.java.springboot.kafka.kafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

	private kafkaProducer kafkaProducer;

	public MessageController(net.java.springboot.kafka.kafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}

	// http:localhost:8080/api/v1/kafka/publish?message=hello world
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message) {

		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("<h1>Message sent to the topic.</h1>");

	}

}
