package com.penjanje.backend.entity.impl;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "proizvod")
public class Proizvod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proizvodID;

    private String naziv;
    private String opis;
    private String slika;
    private Double velicina;

    @OneToMany(mappedBy = "proizvod")
    private List<RadnjaProizvod> radnjaProizvodi;

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
    public List<RadnjaProizvod> getRadnjaProizvodi() { return radnjaProizvodi; }
    public void setRadnjaProizvodi(List<RadnjaProizvod> radnjaProizvodi) { this.radnjaProizvodi = radnjaProizvodi; }
}