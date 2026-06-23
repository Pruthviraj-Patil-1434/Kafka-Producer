package com.pub.PubApp.service;

import com.pub.PubApp.config.AppConstants;
import com.pub.PubApp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    KafkaTemplate<String,Customer> kafkaTemplate;

    public String addCxMessage(Customer cx){
        kafkaTemplate.send(AppConstants.TOPIC_NAME,cx);
        return "Message Sent";
    }
 }
