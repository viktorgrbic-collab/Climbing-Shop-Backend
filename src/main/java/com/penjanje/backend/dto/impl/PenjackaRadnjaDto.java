package com.penjanje.backend.dto.impl;

public class PenjackaRadnjaDto {
    private Long penjackaRadnjaID;
    private String naziv;
    private String adresa;
    private String telefon;
    private String email;
    private String radnoVreme;

    public PenjackaRadnjaDto() {}

    public PenjackaRadnjaDto(Long penjackaRadnjaID, String naziv, String adresa, String telefon, String email, String radnoVreme) {
        this.penjackaRadnjaID = penjackaRadnjaID;
        this.naziv = naziv;
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
        this.radnoVreme = radnoVreme;
    }

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
}