package com.tharmony.controller;

import com.tharmony.records.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClientController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public ClientController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping(value = "/messages")
    public void publish(@RequestBody MessageRequest request) {
        kafkaTemplate.send("news", request.message());
    }


    @GetMapping(value = "/tons")
    @ResponseBody
    public void publish2(@RequestParam String req) {
        System.out.println(req);
        kafkaTemplate.send("news", req);
    }
}
