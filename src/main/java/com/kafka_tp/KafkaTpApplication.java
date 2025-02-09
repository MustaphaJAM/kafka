package com.kafka_tp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaTpApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaTpApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
            KafkaTemplate<String, String> KafkaTemplate) {
        return args ->{
            for (int i = 0; i <10; i++){
//            KafkaTemplate.send("mustaphas_First_topic", "hello kafka " + i +";)");
            KafkaTemplate.send(
                    "mustaphas_First_topic",
                    "Happy 20th Birthday, " +
                            "Mustapha! \uD83E\uDD42\uD83C\uDF82 "
                            + i + "🎉🎉🎉🎉");
            }
        };
    }
}
