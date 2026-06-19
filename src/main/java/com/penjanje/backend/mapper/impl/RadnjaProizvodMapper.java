package com.penjanje.backend.mapper.impl;

import com.penjanje.backend.dto.impl.RadnjaProizvodDto;
import com.penjanje.backend.entity.impl.RadnjaProizvod;
import com.penjanje.backend.entity.impl.PenjackaRadnja;
import com.penjanje.backend.entity.impl.Proizvod;

public class RadnjaProizvodMapper {

   public RadnjaProizvodDto toDto(RadnjaProizvod e) {
    Long radnjaId = e.getPenjackaRadnja() != null ? e.getPenjackaRadnja().getPenjackaRadnjaID() : null;
    Long proizvodId = e.getProizvod() != null ? e.getProizvod().getProizvodID() : null;
    String nazivProizvoda = e.getProizvod() != null ? e.getProizvod().getNaziv() : null;
    String opisProizvoda = e.getProizvod() != null ? e.getProizvod().getOpis() : null;
    String nazivRadnje = e.getPenjackaRadnja() != null ? e.getPenjackaRadnja().getNaziv() : null;
    String adresaRadnje = e.getPenjackaRadnja() != null ? e.getPenjackaRadnja().getAdresa() : null;

    return new RadnjaProizvodDto(
        e.getId(),
        radnjaId,
        proizvodId,
        e.getCena(),
        e.getStanje(),
        e.getPopust(),
        nazivProizvoda,
        opisProizvoda,
        nazivRadnje,
        adresaRadnje
    );
}

    public RadnjaProizvod toEntity(RadnjaProizvodDto dto) {
        RadnjaProizvod rp = new RadnjaProizvod();
        rp.setId(dto.getId());
        rp.setCena(dto.getCena());
        rp.setStanje(dto.getStanje());
        rp.setPopust(dto.getPopust());
        if (dto.getPenjackaRadnjaID() != null) {
            PenjackaRadnja r = new PenjackaRadnja();
            r.setPenjackaRadnjaID(dto.getPenjackaRadnjaID());
            rp.setPenjackaRadnja(r);
        }
        if (dto.getProizvodID() != null) {
            Proizvod p = new Proizvod();
            p.setProizvodID(dto.getProizvodID());
            rp.setProizvod(p);
        }
        return rp;
    }
}