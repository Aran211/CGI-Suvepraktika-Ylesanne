package com.example.cgi_suvepraktika;

public interface UserService {
    User validateUser(String username, String password) throws Exeption;

    User registerUser(String username, String password) throws Exeption;


    Integer createUser(String username, String password) throws Exception;
}
