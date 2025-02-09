package com.kafka_tp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    private static final Logger logger = LoggerFactory.getLogger(KafkaTopicConfig.class);


    @Bean
    public NewTopic mustaphasFirstTopic() {
        logger.info("Creating Kafka Topic: mustaphas_First_topic");
        return TopicBuilder.name("mustaphas_First_topic")
                .build();
    }
}
