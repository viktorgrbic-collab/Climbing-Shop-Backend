package com.penjanje.backend.entity.impl;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "penjacka_radnja")
public class PenjackaRadnja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long penjackaRadnjaID;

    private String naziv;
    private String adresa;
    private String telefon;
    private String email;
    private String radnoVreme;

    @OneToMany(mappedBy = "penjackaRadnja")
    private List<RadnjaProizvod> radnjaProizvodi;

    public Long getPenjackaRadnjaID() { return penjackaRadnjaID; }
    public void setPenjackaRadnjaID(Long penjackaRadnjaID) { this.penjackaRadnjaID = penjackaRadnjaID; }
    public String getNaziv() { return naziv; }
    public void setNaziv(String naziv) { this.naziv = naziv; }
    public String getAdresa() { return adresa; }
    public void setAdresa(String adresa) { this.adresa = adresa; }
    public String getTelefon() { return telefon; }
    public void setTelefon(String telefon) { this.telefon = telefon; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRadnoVreme() { return radnoVreme; }
    public void setRadnoVreme(String radnoVreme) { this.radnoVreme = radnoVreme; }
    public List<RadnjaProizvod> getRadnjaProizvodi() { return radnjaProizvodi; }
    public void setRadnjaProizvodi(List<RadnjaProizvod> radnjaProizvodi) { this.radnjaProizvodi = radnjaProizvodi; }
}