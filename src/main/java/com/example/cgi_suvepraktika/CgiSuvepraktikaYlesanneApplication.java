package com.example.cgi_suvepraktika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CgiSuvepraktikaYlesanneApplication {

    public static void main(String[] args) {


        SpringApplication.run(CgiSuvepraktikaYlesanneApplication.class, args);
        new Film("Pahad poisid", "Komöödia", "Inglise", 12, "Kaspar Jancis");
        new Film("Pahad poisid", "Komöödia", "Eesti", 12, "Jancis");
        new Film("Pahad poisid", "Komöödia", "Eesti", 12, "Kaspar");
        new Film("Pahad poisid", "Komöödia", "Eesti", 16, "Jancis");
        Film esimeneFilm = new Film("Pahad poisid", "Komöödia", "Inglise", 12, "Kaspar Jancis");
        System.out.println(esimeneFilm.getPealkiri()+ " " + esimeneFilm.getZanr() + " " + esimeneFilm.getKeel() + " " + esimeneFilm.getVanusepiirang() + " " + esimeneFilm.getLavastaja());
        SpringApplication.run(CgiSuvepraktikaYlesanneApplication.class, args);


    }
    @GetMapping
    public String api() {
        return "Tere tulemast!";
    }

}
