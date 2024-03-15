package com.example.cgi_suvepraktika;

//Interface kasutaja repo jaoks
public interface UserRepo {
    Integer createUser(String username, String password) throws Exception;
    User findUser(String username, String password) throws Exception;


}
