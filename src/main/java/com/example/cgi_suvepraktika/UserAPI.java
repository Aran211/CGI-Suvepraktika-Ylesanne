package com.example.cgi_suvepraktika;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
//kasutaja API
// võimaldab registreerimist ja sisselogimist
@RestController
@RequestMapping("/users")
public class UserAPI {

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, Object> body) {
        String username = (String) body.get("username");
        String password = (String) body.get("password");
        //User user = UserService.registerUser(username, password);
        Map<String, String> map = new HashMap<>();
        map.put("username", "sucessfully registered");
        return "User " + username + " has been registered";
    }

}
