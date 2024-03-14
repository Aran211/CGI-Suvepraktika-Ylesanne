package com.example.cgi_suvepraktika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/")
    public String serveHtmlFile() {
        return "index.html";
    }
}
