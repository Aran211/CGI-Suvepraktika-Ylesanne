package com.example.cgi_suvepraktika;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
// SoovitusSüsteem, mis ideaalis peaks soovitama filme kasutajale, kuid hetkel on see lihtsalt filmide lisamiseks ja kuvamiseks
@SpringBootApplication
@RestController
public class soovitusSüsteem {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private IsteKohadRepository isteKohadRepository;


    @PostMapping("/addFilm")
    public Film addFilm(@RequestBody Film film) {
        return filmRepository.save(film);
    }

    public static void main(String[] args) {
        SpringApplication.run(CgiSuvepraktikaYlesanneApplication.class, args);
    }

    @GetMapping("/films/{id}")
    public Film getFilmById(@PathVariable Long id) {
        return filmRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Film not found"));
    }




}
