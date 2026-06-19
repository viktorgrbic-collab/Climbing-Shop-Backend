package com.penjanje.backend.entity.impl;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "porudzbina")
public class Porudzbina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long porudzbinalD;

    private LocalDate datumPorudzbine;
    private String statusPorudzbine;
    private Double ukupanIznos;
    private String adresaDostave;

    @ManyToOne
    @JoinColumn(name = "korisnik_id")
    private Korisnik korisnik;

    @OneToMany(mappedBy = "porudzbina")
    private List<StavkaPorudzbine> stavke;

    public Long getPorudzbinalD() { return porudzbinalD; }
    public void setPorudzbinalD(Long porudzbinalD) { this.porudzbinalD = porudzbinalD; }
    public LocalDate getDatumPorudzbine() { return datumPorudzbine; }
    public void setDatumPorudzbine(LocalDate datumPorudzbine) { this.datumPorudzbine = datumPorudzbine; }
    public String getStatusPorudzbine() { return statusPorudzbine; }
    public void setStatusPorudzbine(String statusPorudzbine) { this.statusPorudzbine = statusPorudzbine; }
    public Double getUkupanIznos() { return ukupanIznos; }
    public void setUkupanIznos(Double ukupanIznos) { this.ukupanIznos = ukupanIznos; }
    public String getAdresaDostave() { return adresaDostave; }
    public void setAdresaDostave(String adresaDostave) { this.adresaDostave = adresaDostave; }
    public Korisnik getKorisnik() { return korisnik; }
    public void setKorisnik(Korisnik korisnik) { this.korisnik = korisnik; }
    public List<StavkaPorudzbine> getStavke() { return stavke; }
    public void setStavke(List<StavkaPorudzbine> stavke) { this.stavke = stavke; }
}