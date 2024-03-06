package com.example.cgi_suvepraktika;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class FilmController {

    private FilmController soovitusSüsteem;

    @GetMapping
    public ResponseEntity<String> Filmid() {
        return new ResponseEntity<String>("Tere Siia Test!", HttpStatus.OK);
    }


}