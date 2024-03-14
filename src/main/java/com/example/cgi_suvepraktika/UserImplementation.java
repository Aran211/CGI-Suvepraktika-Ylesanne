package com.example.cgi_suvepraktika;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Locale;
import java.util.regex.Pattern;

@Repository
public class UserImplementation implements UserRepo {

    private static final String SQL_CREATE_USER = "INSERT INTO users (username, password) VALUES (?, ?)";
    private static final String SQL_FIND_BY_ID = "SELECT COUNT(*) FROM users WHERE username = ?";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer createUser(String username, String password) throws Exception {
        try{
            GeneratedKeyHolder  keyholder = new GeneratedKeyHolder();
            jdbcTemplate.update(connection -> {
                PreparedStatement ps = connection.prepareStatement(SQL_CREATE_USER, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, username);
                ps.setString(2, password);
                return ps;
            });
            return (Integer) keyholder.getKeys().get("USER_ID");
        }catch (Exception e){
            throw new Exception("Failed to create user");
        }
    }

    @Override
    public User findUser(String username, String password) throws Exception {
        return null;
    }


    public Integer getCountbyUsername(String username) {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM users WHERE username = ?", Integer.class, username);
    }

    public User findById(Integer id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE user_id = ?", new Object[]{id}, userRowMapper);

    }
    private RowMapper<User> userRowMapper = ((rs,rowNum) -> {
        return new User(rs.getString("username"), rs.getString("password"));
    });
}
