package com.example.cgi_suvepraktika;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//repo interface
public interface FilmRepository extends JpaRepository<Film, Long> {

}
