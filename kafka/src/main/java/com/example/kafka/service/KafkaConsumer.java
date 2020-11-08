package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "baeldung", groupId = "tombas")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group tombas: " + message);
    }
}
