package com.app.nginx.common.health;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/health")
@RestController
public class HealthController {

    private static final String UNIQUE_ID = UUID.randomUUID().toString();

    @GetMapping
    public String health() {

        return "Server ID; " + UNIQUE_ID;
    }
}
