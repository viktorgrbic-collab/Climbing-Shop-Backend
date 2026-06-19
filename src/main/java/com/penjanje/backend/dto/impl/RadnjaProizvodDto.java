package com.penjanje.backend.dto.impl;

public class RadnjaProizvodDto {
    private Long id;
    private Long penjackaRadnjaID;
    private Long proizvodID;
    private Double cena;
    private Integer stanje;
    private Double popust;
    private String nazivProizvoda;
    private String opisProizvoda;
    private String nazivRadnje;
    private String adresaRadnje;

    public RadnjaProizvodDto() {}

    public RadnjaProizvodDto(Long id, Long penjackaRadnjaID, Long proizvodID, Double cena, Integer stanje, Double popust, String nazivProizvoda, String opisProizvoda, String nazivRadnje, String adresaRadnje) {
        this.id = id;
        this.penjackaRadnjaID = penjackaRadnjaID;
        this.proizvodID = proizvodID;
        this.cena = cena;
        this.stanje = stanje;
        this.popust = popust;
        this.nazivProizvoda = nazivProizvoda;
        this.opisProizvoda = opisProizvoda;
        this.nazivRadnje = nazivRadnje;
        this.adresaRadnje = adresaRadnje;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getPenjackaRadnjaID() { return penjackaRadnjaID; }
    public void setPenjackaRadnjaID(Long penjackaRadnjaID) { this.penjackaRadnjaID = penjackaRadnjaID; }
    public Long getProizvodID() { return proizvodID; }
    public void setProizvodID(Long proizvodID) { this.proizvodID = proizvodID; }
    public Double getCena() { return cena; }
    public void setCena(Double cena) { this.cena = cena; }
    public Integer getStanje() { return stanje; }
    public void setStanje(Integer stanje) { this.stanje = stanje; }
    public Double getPopust() { return popust; }
    public void setPopust(Double popust) { this.popust = popust; }
    public String getNazivProizvoda() { return nazivProizvoda; }
    public void setNazivProizvoda(String nazivProizvoda) { this.nazivProizvoda = nazivProizvoda; }
    public String getOpisProizvoda() { return opisProizvoda; }
    public void setOpisProizvoda(String opisProizvoda) { this.opisProizvoda = opisProizvoda; }
    public String getNazivRadnje() { return nazivRadnje; }
    public void setNazivRadnje(String nazivRadnje) { this.nazivRadnje = nazivRadnje; }
    public String getAdresaRadnje() { return adresaRadnje; }
    public void setAdresaRadnje(String adresaRadnje) { this.adresaRadnje = adresaRadnje; }
}