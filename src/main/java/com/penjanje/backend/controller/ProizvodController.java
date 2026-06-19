package com.penjanje.backend.controller;
import org.springframework.http.ResponseEntity;
import java.util.stream.Collectors;
import com.penjanje.backend.dto.impl.ProizvodDto;
import com.penjanje.backend.entity.impl.Proizvod;
import com.penjanje.backend.mapper.impl.ProizvodMapper;
import com.penjanje.backend.service.ProizvodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/proizvodi")
@CrossOrigin(origins = "http://localhost:3000")
public class ProizvodController {

    @Autowired
    private ProizvodService proizvodService;

    private ProizvodMapper mapper = new ProizvodMapper();

    @GetMapping
    public List<ProizvodDto> getAll() {
        return proizvodService.getAll()
            .stream()
            .map(p -> mapper.toDto(p))
            .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ProizvodDto getById(@PathVariable Long id) {
        return mapper.toDto(proizvodService.getById(id));
    }

@GetMapping("/pretraga")
public ResponseEntity<?> findByNaziv(@RequestParam String naziv) {
    List<Proizvod> rezultat = proizvodService.findByNaziv(naziv);
    if (rezultat.isEmpty()) {
        return ResponseEntity.status(404).body("Sistem ne moze da pronadje proizvode po zadatim kriterijumima.");
    }
    return ResponseEntity.ok(rezultat.stream().map(p -> mapper.toDto(p)).collect(Collectors.toList()));
}

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProizvodDto dto) {
    try {
        Proizvod p = mapper.toEntity(dto);
        return ResponseEntity.ok(mapper.toDto(proizvodService.save(p)));
    } catch (Exception e) {
        return ResponseEntity.status(500).body("Proizvod nije mogao da bude sacuvan.");
    }
}

    @PutMapping("/{id}")
    public ProizvodDto update(@PathVariable Long id, @RequestBody ProizvodDto dto) {
        dto.setProizvodID(id);
        Proizvod p = mapper.toEntity(dto);
        return mapper.toDto(proizvodService.save(p));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        proizvodService.delete(id);
    }
}