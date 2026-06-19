package com.penjanje.backend.entity.impl;

import jakarta.persistence.*;

@Entity
@Table(name = "radnja_proizvod")
public class RadnjaProizvod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "penjacka_radnja_id")
    private PenjackaRadnja penjackaRadnja;

    @ManyToOne
    @JoinColumn(name = "proizvod_id")
    private Proizvod proizvod;

    private Double cena;
    private Integer stanje;
    private Double popust;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public PenjackaRadnja getPenjackaRadnja() { return penjackaRadnja; }
    public void setPenjackaRadnja(PenjackaRadnja penjackaRadnja) { this.penjackaRadnja = penjackaRadnja; }
    public Proizvod getProizvod() { return proizvod; }
    public void setProizvod(Proizvod proizvod) { this.proizvod = proizvod; }
    public Double getCena() { return cena; }
    public void setCena(Double cena) { this.cena = cena; }
    public Integer getStanje() { return stanje; }
    public void setStanje(Integer stanje) { this.stanje = stanje; }
    public Double getPopust() { return popust; }
    public void setPopust(Double popust) { this.popust = popust; }
}