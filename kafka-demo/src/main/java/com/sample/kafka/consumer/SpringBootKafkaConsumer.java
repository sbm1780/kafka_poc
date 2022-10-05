package com.sample.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sample.kafka.model.Persons;


@Service
public class SpringBootKafkaConsumer {

    @KafkaListener(topics = "${topic.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(Persons value){
        System.out.println("Message Received :: "+value.toString());
        System.out.println("Message getLocation :: "+value.getLocation());
        System.out.println("Message getPublisher :: "+value.getPublisher());
        System.out.println("Message getTopicId :: "+value.getTopicId());
        System.out.println("Message getTopicName :: "+value.getTopicName());
        System.out.println("Message getType :: "+value.getType());


        

    }
}
