package com.penjanje.backend.dto.impl;

import java.time.LocalDate;

public class PorudzbinaDto {
    private Long porudzbinalD;
    private LocalDate datumPorudzbine;
    private String statusPorudzbine;
    private Double ukupanIznos;
    private String adresaDostave;
    private Long korisnikID;

    public PorudzbinaDto() {}

    public PorudzbinaDto(Long porudzbinalD, LocalDate datumPorudzbine, String statusPorudzbine, Double ukupanIznos, String adresaDostave, Long korisnikID) {
        this.porudzbinalD = porudzbinalD;
        this.datumPorudzbine = datumPorudzbine;
        this.statusPorudzbine = statusPorudzbine;
        this.ukupanIznos = ukupanIznos;
        this.adresaDostave = adresaDostave;
        this.korisnikID = korisnikID;
    }

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
    public Long getKorisnikID() { return korisnikID; }
    public void setKorisnikID(Long korisnikID) { this.korisnikID = korisnikID; }
}