package com.penjanje.backend.service;
import com.penjanje.backend.entity.impl.*;
import com.penjanje.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PenjackaRadnjaService {

    @Autowired
    private PenjackaRadnjaRepository penjackaRadnjaRepository;

    public List<PenjackaRadnja> getAll() {
        return penjackaRadnjaRepository.findAll();
    }

    public PenjackaRadnja getById(Long id) {
        return penjackaRadnjaRepository.findById(id).orElse(null);
    }

    public PenjackaRadnja save(PenjackaRadnja penjackaRadnja) {
        return penjackaRadnjaRepository.save(penjackaRadnja);
    }

    public void delete(Long id) {
        penjackaRadnjaRepository.deleteById(id);
    }
}