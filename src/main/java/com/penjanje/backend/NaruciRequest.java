package com.penjanje.backend;

import com.penjanje.backend.dto.impl.PorudzbinaDto;
import com.penjanje.backend.dto.impl.StavkaPorudzbineDto;
import java.util.List;

public class NaruciRequest {
    private PorudzbinaDto porudzbina;
    private List<StavkaPorudzbineDto> stavke;

    public PorudzbinaDto getPorudzbina() { return porudzbina; }
    public void setPorudzbina(PorudzbinaDto porudzbina) { this.porudzbina = porudzbina; }
    public List<StavkaPorudzbineDto> getStavke() { return stavke; }
    public void setStavke(List<StavkaPorudzbineDto> stavke) { this.stavke = stavke; }
}