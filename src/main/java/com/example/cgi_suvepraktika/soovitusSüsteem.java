package com.example.cgi_suvepraktika;

import java.util.ArrayList;
import java.util.List;

public class soovitusSüsteem {
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
