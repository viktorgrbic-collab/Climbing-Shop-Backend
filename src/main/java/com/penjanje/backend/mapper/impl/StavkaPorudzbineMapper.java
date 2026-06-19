package com.penjanje.backend.mapper.impl;

import com.penjanje.backend.dto.impl.StavkaPorudzbineDto;
import com.penjanje.backend.entity.impl.StavkaPorudzbine;
import com.penjanje.backend.entity.impl.Porudzbina;
import com.penjanje.backend.entity.impl.RadnjaProizvod;

public class StavkaPorudzbineMapper {

    public StavkaPorudzbineDto toDto(StavkaPorudzbine e) {
        Long porudzbinаId = e.getPorudzbina() != null ? e.getPorudzbina().getPorudzbinalD() : null;
        Long radnjaProizvodId = e.getRadnjaProizvod() != null ? e.getRadnjaProizvod().getId() : null;
        return new StavkaPorudzbineDto(
            e.getRb(),
            e.getKolicina(),
            e.getCenaPoJedinici(),
            e.getPopust(),
            porudzbinаId,
            radnjaProizvodId
        );
    }

    public StavkaPorudzbine toEntity(StavkaPorudzbineDto dto) {
        StavkaPorudzbine s = new StavkaPorudzbine();
        s.setRb(dto.getRb());
        s.setKolicina(dto.getKolicina());
        s.setCenaPoJedinici(dto.getCenaPoJedinici());
        s.setPopust(dto.getPopust());
        if (dto.getPorudzbinаID() != null) {
            Porudzbina p = new Porudzbina();
            p.setPorudzbinalD(dto.getPorudzbinаID());
            s.setPorudzbina(p);
        }
        if (dto.getRadnjaProizvodID() != null) {
            RadnjaProizvod rp = new RadnjaProizvod();
            rp.setId(dto.getRadnjaProizvodID());
            s.setRadnjaProizvod(rp);
        }
        return s;
    }
}