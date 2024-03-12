package com.example.cgi_suvepraktika;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class soovitusSüsteem {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private IsteKohadRepository isteKohadRepository;

    public List<isteKohad> getAllAvailableSeats() {
        return isteKohadRepository.findByKasVaba(true);
    }

    @GetMapping("/filmsAndSeats")
    public Map<String, List<?>> getFilmsAndSeats() {
        Map<String, List<?>> filmsAndSeats = new HashMap<>();
        filmsAndSeats.put("Saadaval olevad filmid", getAllFilms());
        filmsAndSeats.put("Kinosaalis olevad kohad", getAllAvailableSeats());
        return filmsAndSeats;
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @PostMapping("/addFilm")
    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    public static void main(String[] args) {
        SpringApplication.run(CgiSuvepraktikaYlesanneApplication.class, args);
    }
    @GetMapping("/films")
    public List<Film> api() {
        return getAllFilms();
    }

    public List<Film> getFilmByZanr(String zanr) {
        return filmRepository.findByZanr(zanr);
    }
}
