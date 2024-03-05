package com.example.cgi_suvepraktika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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

}
