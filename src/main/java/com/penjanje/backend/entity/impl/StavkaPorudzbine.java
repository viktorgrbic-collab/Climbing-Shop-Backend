package com.penjanje.backend.entity.impl;

import jakarta.persistence.*;

@Entity
@Table(name = "stavka_porudzbine")
public class StavkaPorudzbine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rb;

    private Integer kolicina;
    private Double cenaPoJedinici;
    private Double popust;

    @ManyToOne
    @JoinColumn(name = "porudzbina_id")
    private Porudzbina porudzbina;

    @ManyToOne
    @JoinColumn(name = "radnja_proizvod_id")
    private RadnjaProizvod radnjaProizvod;

    public Long getRb() { return rb; }
    public void setRb(Long rb) { this.rb = rb; }
    public Integer getKolicina() { return kolicina; }
    public void setKolicina(Integer kolicina) { this.kolicina = kolicina; }
    public Double getCenaPoJedinici() { return cenaPoJedinici; }
    public void setCenaPoJedinici(Double cenaPoJedinici) { this.cenaPoJedinici = cenaPoJedinici; }
    public Double getPopust() { return popust; }
    public void setPopust(Double popust) { this.popust = popust; }
    public Porudzbina getPorudzbina() { return porudzbina; }
    public void setPorudzbina(Porudzbina porudzbina) { this.porudzbina = porudzbina; }
    public RadnjaProizvod getRadnjaProizvod() { return radnjaProizvod; }
    public void setRadnjaProizvod(RadnjaProizvod radnjaProizvod) { this.radnjaProizvod = radnjaProizvod; }
}