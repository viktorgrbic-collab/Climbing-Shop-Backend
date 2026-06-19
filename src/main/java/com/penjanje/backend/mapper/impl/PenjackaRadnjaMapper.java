package com.penjanje.backend.mapper.impl;

import com.penjanje.backend.dto.impl.PenjackaRadnjaDto;
import com.penjanje.backend.entity.impl.PenjackaRadnja;

public class PenjackaRadnjaMapper {

    public PenjackaRadnjaDto toDto(PenjackaRadnja e) {
        return new PenjackaRadnjaDto(
            e.getPenjackaRadnjaID(),
            e.getNaziv(),
            e.getAdresa(),
            e.getTelefon(),
            e.getEmail(),
            e.getRadnoVreme()
        );
    }

    public PenjackaRadnja toEntity(PenjackaRadnjaDto dto) {
        PenjackaRadnja r = new PenjackaRadnja();
        r.setPenjackaRadnjaID(dto.getPenjackaRadnjaID());
        r.setNaziv(dto.getNaziv());
        r.setAdresa(dto.getAdresa());
        r.setTelefon(dto.getTelefon());
        r.setEmail(dto.getEmail());
        r.setRadnoVreme(dto.getRadnoVreme());
        return r;
    }
}