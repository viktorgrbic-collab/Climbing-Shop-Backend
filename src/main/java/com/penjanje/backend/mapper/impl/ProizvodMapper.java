package com.penjanje.backend.mapper.impl;

import com.penjanje.backend.dto.impl.ProizvodDto;
import com.penjanje.backend.entity.impl.Proizvod;

public class ProizvodMapper {

    public ProizvodDto toDto(Proizvod e) {
        return new ProizvodDto(
            e.getProizvodID(),
            e.getNaziv(),
            e.getOpis(),
            e.getSlika(),
            e.getVelicina()
        );
    }

    public Proizvod toEntity(ProizvodDto dto) {
        Proizvod p = new Proizvod();
        p.setProizvodID(dto.getProizvodID());
        p.setNaziv(dto.getNaziv());
        p.setOpis(dto.getOpis());
        p.setSlika(dto.getSlika());
        p.setVelicina(dto.getVelicina());
        return p;
    }
}