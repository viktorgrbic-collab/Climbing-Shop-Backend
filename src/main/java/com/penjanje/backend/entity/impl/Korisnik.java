package com.penjanje.backend.entity.impl;

import jakarta.persistence.*;

@Entity
@Table(name = "korisnik")
public class Korisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long korisnikID;

    private String username;
    private String password;
    private String email;
    private String ime;
    private String prezime;
    private String adresa;
    private String uloga;

    public Long getKorisnikID() { return korisnikID; }
    public void setKorisnikID(Long korisnikID) { this.korisnikID = korisnikID; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getIme() { return ime; }
    public void setIme(String ime) { this.ime = ime; }
    public String getPrezime() { return prezime; }
    public void setPrezime(String prezime) { this.prezime = prezime; }
    public String getAdresa() { return adresa; }
    public void setAdresa(String adresa) { this.adresa = adresa; }
    public String getUloga() { return uloga; }
    public void setUloga(String uloga) { this.uloga = uloga; }
}