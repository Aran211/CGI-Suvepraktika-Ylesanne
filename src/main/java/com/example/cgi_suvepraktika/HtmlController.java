package com.example.cgi_suvepraktika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//html faili kuvamine
@Controller
public class HtmlController {

    @GetMapping("/")
    public String serveHtmlFile() {
        return "index.html";
    }
}
