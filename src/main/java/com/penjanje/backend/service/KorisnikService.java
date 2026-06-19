package com.penjanje.backend.service;
import com.penjanje.backend.entity.impl.*;
import com.penjanje.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KorisnikService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    public List<Korisnik> getAll() {
        return korisnikRepository.findAll();
    }

    public Korisnik getById(Long id) {
        return korisnikRepository.findById(id).orElse(null);
    }

    public Korisnik save(Korisnik korisnik) {
        return korisnikRepository.save(korisnik);
    }

    public void delete(Long id) {
        korisnikRepository.deleteById(id);
    }

    public Korisnik findByUsername(String username) {
        return korisnikRepository.findByUsername(username);
    }
}