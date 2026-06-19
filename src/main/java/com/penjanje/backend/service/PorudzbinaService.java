package com.penjanje.backend.service;
import com.penjanje.backend.entity.impl.*;
import com.penjanje.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PorudzbinaService {

    @Autowired
    private PorudzbinaRepository porudzbinaRepository;
    @Autowired
    private StavkaPorudzbineRepository stavkaPorudzbineRepository;

    public List<Porudzbina> getAll() {
        return porudzbinaRepository.findAll();
    }
    public Porudzbina getById(Long id) {
        return porudzbinaRepository.findById(id).orElse(null);
    }
    public Porudzbina save(Porudzbina porudzbina) {
        return porudzbinaRepository.save(porudzbina);
    }
    public void delete(Long id) {
        porudzbinaRepository.deleteById(id);
    }
    public List<Porudzbina> findByKorisnik(Korisnik korisnik) {
        return porudzbinaRepository.findByKorisnik(korisnik);
    }
    
    public Porudzbina saveWithStavke(Porudzbina porudzbina, List<StavkaPorudzbine> stavke) {
    double ukupno = stavke.stream()
        .mapToDouble(s -> {
            double cena = s.getCenaPoJedinici();
            double popust = s.getPopust() != null ? s.getPopust() : 0;
            int kolicina = s.getKolicina() != null ? s.getKolicina() : 1;
            return (cena - (cena * popust / 100)) * kolicina;
        })
        .sum();
    
    porudzbina.setUkupanIznos(ukupno);
    Porudzbina sacuvana = porudzbinaRepository.save(porudzbina);
    
    for (StavkaPorudzbine stavka : stavke) {
        stavka.setPorudzbina(sacuvana);
        stavkaPorudzbineRepository.save(stavka);
    }
    
    return sacuvana;
}
}