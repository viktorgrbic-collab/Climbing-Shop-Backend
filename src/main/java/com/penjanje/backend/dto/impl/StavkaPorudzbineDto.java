package com.penjanje.backend.dto.impl;

public class StavkaPorudzbineDto {
    private Long rb;
    private Integer kolicina;
    private Double cenaPoJedinici;
    private Double popust;
    private Long porudzbinаID;
    private Long radnjaProizvodID;

    public StavkaPorudzbineDto() {}

    public StavkaPorudzbineDto(Long rb, Integer kolicina, Double cenaPoJedinici, Double popust, Long porudzbinаID, Long radnjaProizvodID) {
        this.rb = rb;
        this.kolicina = kolicina;
        this.cenaPoJedinici = cenaPoJedinici;
        this.popust = popust;
        this.porudzbinаID = porudzbinаID;
        this.radnjaProizvodID = radnjaProizvodID;
    }

    public Long getRb() { return rb; }
    public void setRb(Long rb) { this.rb = rb; }
    public Integer getKolicina() { return kolicina; }
    public void setKolicina(Integer kolicina) { this.kolicina = kolicina; }
    public Double getCenaPoJedinici() { return cenaPoJedinici; }
    public void setCenaPoJedinici(Double cenaPoJedinici) { this.cenaPoJedinici = cenaPoJedinici; }
    public Double getPopust() { return popust; }
    public void setPopust(Double popust) { this.popust = popust; }
    public Long getPorudzbinаID() { return porudzbinаID; }
    public void setPorudzbinаID(Long porudzbinаID) { this.porudzbinаID = porudzbinаID; }
    public Long getRadnjaProizvodID() { return radnjaProizvodID; }
    public void setRadnjaProizvodID(Long radnjaProizvodID) { this.radnjaProizvodID = radnjaProizvodID; }
}