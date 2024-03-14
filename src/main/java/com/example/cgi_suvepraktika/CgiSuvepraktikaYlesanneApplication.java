package com.example.cgi_suvepraktika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CgiSuvepraktikaYlesanneApplication {

    public static void main(String[] args) {

        SpringApplication.run(CgiSuvepraktikaYlesanneApplication.class, args);
    }

}
