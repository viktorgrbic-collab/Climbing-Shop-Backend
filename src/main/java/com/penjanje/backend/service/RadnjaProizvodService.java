package com.penjanje.backend.service;
import com.penjanje.backend.entity.impl.*;
import com.penjanje.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RadnjaProizvodService {

    @Autowired
    private RadnjaProizvodRepository radnjaProizvodRepository;

    public List<RadnjaProizvod> getAll() {
        return radnjaProizvodRepository.findAll();
    }

    public RadnjaProizvod getById(Long id) {
        return radnjaProizvodRepository.findById(id).orElse(null);
    }

    public RadnjaProizvod save(RadnjaProizvod radnjaProizvod) {
        return radnjaProizvodRepository.save(radnjaProizvod);
    }

    public void delete(Long id) {
        radnjaProizvodRepository.deleteById(id);
    }

    public List<RadnjaProizvod> findByRadnja(PenjackaRadnja penjackaRadnja) {
        return radnjaProizvodRepository.findByPenjackaRadnja(penjackaRadnja);
    }

    public List<RadnjaProizvod> findByProizvod(Proizvod proizvod) {
        return radnjaProizvodRepository.findByProizvod(proizvod);
    }
}