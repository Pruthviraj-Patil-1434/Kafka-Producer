package com.pub.PubApp.rest;

import com.pub.PubApp.model.Customer;
import com.pub.PubApp.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping("/addCx")
    public String addCustomerData(@RequestBody Customer cd){
               return  kafkaService.addCxMessage(cd);
    }

}
