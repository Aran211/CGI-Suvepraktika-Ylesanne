package com.example.cgi_suvepraktika;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Istekohtade repo interface
@Repository
public interface IsteKohadRepository extends JpaRepository<isteKohad, Long> {
    List<isteKohad> findByKasVaba(boolean kasVaba);
}
