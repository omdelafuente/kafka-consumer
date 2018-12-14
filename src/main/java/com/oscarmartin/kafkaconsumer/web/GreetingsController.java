package com.oscarmartin.kafkaconsumer.web;

import com.oscarmartin.kafkaconsumer.service.GreetingsListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    private final GreetingsListener greetingsListener;

    public GreetingsController(GreetingsListener greetingsListener){
        this.greetingsListener = greetingsListener;
    }
}
