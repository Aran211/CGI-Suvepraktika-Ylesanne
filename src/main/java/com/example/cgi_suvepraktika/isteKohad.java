package com.example.cgi_suvepraktika;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "iste_kohad")
public class isteKohad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "rida")
    private int rida;

    @Column(name = "veerg")
    private int veerg;

    @Column(name = "kas_vaba")
    private boolean kasVaba;

    public int getRida() {
        return rida;
    }

    public void setRida(int rida) {
        this.rida = rida;
    }

    public int getVeerg() {
        return veerg;
    }

    public void setVeerg(int veerg) {
        this.veerg = veerg;
    }

    public boolean isKasVaba() {
        return kasVaba;
    }

    public void setKasVaba(boolean kasVaba) {
        this.kasVaba = kasVaba;
    }
}
