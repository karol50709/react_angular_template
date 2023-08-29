package com.karol.springangulartemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController()
public class SpringAngularTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularTemplateApplication.class, args);
    }

    @GetMapping("/time")
    public String helloWorld(){
        return LocalDateTime.now().toString();
    }

}
