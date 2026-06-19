package com.penjanje.backend.mapper.impl;

import com.penjanje.backend.dto.impl.KorisnikDto;
import com.penjanje.backend.entity.impl.Korisnik;

public class KorisnikMapper {

   public KorisnikDto toDto(Korisnik e) {
    KorisnikDto dto = new KorisnikDto(
        e.getKorisnikID(),
        e.getUsername(),
        e.getEmail(),
        e.getIme(),
        e.getPrezime(),
        e.getAdresa()
    );
    dto.setUloga(e.getUloga());
    return dto;
}

    public Korisnik toEntity(KorisnikDto dto) {
        Korisnik k = new Korisnik();
        k.setKorisnikID(dto.getKorisnikID());
        k.setUsername(dto.getUsername());
        k.setEmail(dto.getEmail());
        k.setIme(dto.getIme());
        k.setPrezime(dto.getPrezime());
        k.setAdresa(dto.getAdresa());
        k.setUloga(dto.getUloga());
        k.setPassword(dto.getPassword());
        return k;
    }
}