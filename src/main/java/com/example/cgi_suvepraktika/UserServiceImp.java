package com.example.cgi_suvepraktika;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImp implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public User validateUser(String username, String password) throws Exeption {
        return null;
    }

    @Override
    public User registerUser(String username, String password) throws Exeption {
        return null;
    }

    @Override
    public Integer createUser(String username, String password) throws Exception {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        if (username != null) username = username.toLowerCase();
        if (!pattern.matcher(username).matches()) {
            throw new Exception("Invalid format of username");

        }
        return userRepo.createUser(username, password);
    }
}
