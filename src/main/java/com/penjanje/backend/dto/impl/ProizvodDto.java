package com.penjanje.backend.dto.impl;

public class ProizvodDto {
    private Long proizvodID;
    private String naziv;
    private String opis;
    private String slika;
    private Double velicina;

    public ProizvodDto() {}

    public ProizvodDto(Long proizvodID, String naziv, String opis, String slika, Double velicina) {
        this.proizvodID = proizvodID;
        this.naziv = naziv;
        this.opis = opis;
        this.slika = slika;
        this.velicina = velicina;
    }

    public Long getProizvodID() { return proizvodID; }
    public void setProizvodID(Long proizvodID) { this.proizvodID = proizvodID; }
    public String getNaziv() { return naziv; }
    public void setNaziv(String naziv) { this.naziv = naziv; }
    public String getOpis() { return opis; }
    public void setOpis(String opis) { this.opis = opis; }
    public String getSlika() { return slika; }
    public void setSlika(String slika) { this.slika = slika; }
    public Double getVelicina() { return velicina; }
    public void setVelicina(Double velicina) { this.velicina = velicina; }
}