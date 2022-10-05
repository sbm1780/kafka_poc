package com.sample.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.kafka.model.Persons;
import com.sample.kafka.producer.SpringBootKafkaProducer;

@RestController
public class SpringBootKafkaRestController {

    @Autowired
    SpringBootKafkaProducer springBootKafkaProducer;

	/*
	 * @GetMapping(value = "/send/{message}") public void send(@PathVariable String
	 * message) { springBootKafkaProducer.sendMessage(message); }
	 */

	@PostMapping(value = "/send") public void send(@RequestBody Persons
	  tutorial) { springBootKafkaProducer.sendMessage(tutorial); }
	 

}
