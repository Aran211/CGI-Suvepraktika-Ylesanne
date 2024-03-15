package com.example.cgi_suvepraktika;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import java.time.LocalTime;

//filmide andmebaasi tabeli loomine
//filmide klassi atribuudid
@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "pealkiri")
    private String pealkiri;

    @Column(name = "zanr")
    private String zanr;

    @Column(name = "algusAeg")
    private LocalTime algusAeg;

    @Column(name = "keel")
    private String keel;

    @Column(name = "vanusepiirang")
    private int vanusepiirang;

    @Column(name = "lavastaja")
    private String lavastaja;

    public Film() {
    }

    public Film(String pealkiri, String zanr, String keel, int vanusepiirang, String lavastaja) {
        this.pealkiri = pealkiri;
        this.zanr = zanr;
        this.keel = keel;
        this.vanusepiirang = vanusepiirang;
        this.lavastaja = lavastaja;
    }

    public String getPealkiri() {
        return pealkiri;
    }

    public void setPealkiri(String pealkiri) {
        this.pealkiri = pealkiri;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getKeel() {
        return keel;
    }

    public void setKeel(String keel) {
        this.keel = keel;
    }

    public int getVanusepiirang() {
        return vanusepiirang;
    }

    public void setVanusepiirang(int vanusepiirang) {
        this.vanusepiirang = vanusepiirang;
    }

    public String getLavastaja() {
        return lavastaja;
    }

    public void setLavastaja(String lavastaja) {
        this.lavastaja = lavastaja;
    }

    public LocalTime getAlgusAeg() {
        return algusAeg;
    }

    public void setAlgusAeg(LocalTime algusAeg) {
        this.algusAeg = algusAeg;
    }


}