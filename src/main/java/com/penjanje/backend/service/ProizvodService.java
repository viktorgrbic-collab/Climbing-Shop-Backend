package com.penjanje.backend.service;
import com.penjanje.backend.entity.impl.*;
import com.penjanje.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProizvodService {

    @Autowired
    private ProizvodRepository proizvodRepository;

    public List<Proizvod> getAll() {
        return proizvodRepository.findAll();
    }

    public Proizvod getById(Long id) {
        return proizvodRepository.findById(id).orElse(null);
    }

    public Proizvod save(Proizvod proizvod) {
        return proizvodRepository.save(proizvod);
    }

    public void delete(Long id) {
        proizvodRepository.deleteById(id);
    }

    public List<Proizvod> findByNaziv(String naziv) {
        return proizvodRepository.findByNazivContaining(naziv);
    }
}