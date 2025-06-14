package com.pm.start_ci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StartCiCdApplication {

    @GetMapping("/start")
    public String start() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartCiCdApplication.class, args);
    }

}
