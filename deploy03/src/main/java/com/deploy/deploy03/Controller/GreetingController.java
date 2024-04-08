package com.deploy.deploy03.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${authCode}")
    private String authCode;

    @Value("${devName}")
    private String devName;

    @GetMapping("/")
    public String greeting() {
        return "Ciao, sviluppato da " + devName + ". Il codice di autenticazione è " + authCode + ".";
    }
}