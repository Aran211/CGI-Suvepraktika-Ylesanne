package com.example.cgi_suvepraktika;

public class Film {
    private String pealkiri;
    private String zanr;
    private String keel;
    private int vanusepiirang;
    private String lavastaja;

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

}