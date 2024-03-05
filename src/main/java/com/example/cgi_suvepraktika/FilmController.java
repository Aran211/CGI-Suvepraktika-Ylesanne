package com.example.cgi_suvepraktika;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmController {

    @GetMapping("/film")
    public String getFilm(Model model) {
        Film film = new Film("Pahad poisid", "Komöödia", "Inglise", 12, "Kaspar Jancis");
        model.addAttribute("film", film);
        return "film";
    }
}