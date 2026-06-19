package com.penjanje.backend.mapper.impl;

import com.penjanje.backend.dto.impl.PorudzbinaDto;
import com.penjanje.backend.entity.impl.Porudzbina;
import com.penjanje.backend.entity.impl.Korisnik;

public class PorudzbinaMapper {

    public PorudzbinaDto toDto(Porudzbina e) {
        Long korisnikId = e.getKorisnik() != null ? e.getKorisnik().getKorisnikID() : null;
        return new PorudzbinaDto(
            e.getPorudzbinalD(),
            e.getDatumPorudzbine(),
            e.getStatusPorudzbine(),
            e.getUkupanIznos(),
            e.getAdresaDostave(),
            korisnikId
        );
    }

    public Porudzbina toEntity(PorudzbinaDto dto) {
        Porudzbina p = new Porudzbina();
        p.setPorudzbinalD(dto.getPorudzbinalD());
        p.setDatumPorudzbine(dto.getDatumPorudzbine());
        p.setStatusPorudzbine(dto.getStatusPorudzbine());
        p.setUkupanIznos(dto.getUkupanIznos());
        p.setAdresaDostave(dto.getAdresaDostave());
        if (dto.getKorisnikID() != null) {
            Korisnik k = new Korisnik();
            k.setKorisnikID(dto.getKorisnikID());
            p.setKorisnik(k);
        }
        return p;
    }
}