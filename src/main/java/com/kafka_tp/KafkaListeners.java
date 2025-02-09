package com.kafka_tp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "mustaphas_First_topic",
            groupId = "groupId"
    )
    void listen(String data) {
        System.out.println("Listener received data" + data);
    }

}
