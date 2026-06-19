package com.penjanje.backend.service;
import com.penjanje.backend.entity.impl.*;
import com.penjanje.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StavkaPorudzbineService {

    @Autowired
    private StavkaPorudzbineRepository stavkaPorudzbineRepository;

    public List<StavkaPorudzbine> getAll() {
        return stavkaPorudzbineRepository.findAll();
    }

    public StavkaPorudzbine getById(Long id) {
        return stavkaPorudzbineRepository.findById(id).orElse(null);
    }

    public StavkaPorudzbine save(StavkaPorudzbine stavkaPorudzbine) {
        return stavkaPorudzbineRepository.save(stavkaPorudzbine);
    }

    public void delete(Long id) {
        stavkaPorudzbineRepository.deleteById(id);
    }

    public List<StavkaPorudzbine> findByPorudzbina(Porudzbina porudzbina) {
        return stavkaPorudzbineRepository.findByPorudzbina(porudzbina);
    }
}