package com.example.kafka.controller;

import com.example.kafka.service.KafkaProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping(path = "/send")
    public void getConsumedMessage(
            @RequestParam(name = "msg", defaultValue = "ola") String msg
    ){
        this.kafkaProducer.sendMessage(msg);
    }
}
