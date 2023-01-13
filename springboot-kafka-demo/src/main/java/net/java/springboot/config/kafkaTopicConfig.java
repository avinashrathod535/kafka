package net.java.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

	// to create a topic
	@Bean
	public NewTopic javaTopic() {

		return TopicBuilder.name("javaguides").build();
	}

}
