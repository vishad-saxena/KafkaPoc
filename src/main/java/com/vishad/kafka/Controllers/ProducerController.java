package com.vishad.kafka.Controllers;

import com.vishad.kafka.DTOs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProducerController {
    private static final String TOPIC = "kafka_producer";
    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    
    @GetMapping("/kafka/{name}")
    public String publishMessageToKafka(@PathVariable String name){
        kafkaTemplate.send(TOPIC,new User(name,"30","male"));
        System.out.println("submitted successfully");
        return"submitted successfully";
    }
}
