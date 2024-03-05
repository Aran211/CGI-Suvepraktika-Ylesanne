package com.example.cgi_suvepraktika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class soovitusSüsteem {

    @GetMapping("/recommendation")
    public List <Film> soovitaFilm (List <Film> filmid, String zanr, String keel, int vanusepiirang) {
        List <Film> soovitatudFilmid = new ArrayList<Film>();
        for (Film film : filmid) {
            if (film.getZanr().equals(zanr) && film.getKeel().equals(keel) && film.getVanusepiirang() <= vanusepiirang) {
                soovitatudFilmid.add(film);
            }
        }
        return soovitatudFilmid;
    }

}
