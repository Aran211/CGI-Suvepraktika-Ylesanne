package com.example.cgi_suvepraktika;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Service
public class soovitusSüsteem {
    private List<Film> filmid = new ArrayList<>();
   /* public ResponseEntity<List<Film>> getMovies() {
        return ResponseEntity.ok(soovitusSüsteem.getFilm());
    }
*/
    public List<Film> getFilm() {
        return filmid;
    }

    public void addFilm(Film film) {
        filmid.add(film);
    }

    public List<Film> getFilteredMovies(String zanr) {
        List<Film> filteredMovies = new ArrayList<>();
        for (Film film : filmid) {
            if (film.getZanr().equals(zanr)) {
                filteredMovies.add(film);
            }
        }
        return filteredMovies;
    }
}
