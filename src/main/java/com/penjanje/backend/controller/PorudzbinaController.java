package com.penjanje.backend.controller;
import org.springframework.http.ResponseEntity;
import java.util.stream.Collectors;
import com.penjanje.backend.dto.impl.PorudzbinaDto;
import com.penjanje.backend.entity.impl.Korisnik;
import com.penjanje.backend.dto.impl.StavkaPorudzbineDto;
import com.penjanje.backend.NaruciRequest;
import com.penjanje.backend.entity.impl.Porudzbina;
import com.penjanje.backend.mapper.impl.PorudzbinaMapper;
import com.penjanje.backend.service.PorudzbinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;
import com.penjanje.backend.entity.impl.StavkaPorudzbine;
import com.penjanje.backend.mapper.impl.StavkaPorudzbineMapper;

@RestController
@RequestMapping("/api/porudzbine")
@CrossOrigin(origins = "http://localhost:3000")
public class PorudzbinaController {

    @Autowired
    private PorudzbinaService porudzbinaService;

    private PorudzbinaMapper mapper = new PorudzbinaMapper();

    @GetMapping
    public List<PorudzbinaDto> getAll() {
        return porudzbinaService.getAll()
            .stream()
            .map(p -> mapper.toDto(p))
            .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PorudzbinaDto getById(@PathVariable Long id) {
        return mapper.toDto(porudzbinaService.getById(id));
    }

    @PostMapping
public ResponseEntity<?> save(@RequestBody PorudzbinaDto dto) {
    try {
        Porudzbina p = mapper.toEntity(dto);
        return ResponseEntity.ok(mapper.toDto(porudzbinaService.save(p)));
    } catch (Exception e) {
        return ResponseEntity.status(500).body("Porudzbina nije mogla da bude sacuvana.");
    }
}

    @PutMapping("/{id}")
    public PorudzbinaDto update(@PathVariable Long id, @RequestBody PorudzbinaDto dto) {
        dto.setPorudzbinalD(id);
        Porudzbina p = mapper.toEntity(dto);
        return mapper.toDto(porudzbinaService.save(p));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        porudzbinaService.delete(id);
    }
    
    @GetMapping("/korisnik/{korisnikId}")
    public List<PorudzbinaDto> getByKorisnik(@PathVariable Long korisnikId) {
    Korisnik k = new Korisnik();
    k.setKorisnikID(korisnikId);
    return porudzbinaService.findByKorisnik(k)
        .stream()
        .map(p -> mapper.toDto(p))
        .collect(Collectors.toList());
}
    
@PostMapping("/naruci")
public ResponseEntity<?> naruci(@RequestBody NaruciRequest request) {
    try {
        Porudzbina porudzbina = mapper.toEntity(request.getPorudzbina());
        StavkaPorudzbineMapper stavkaMapper = new StavkaPorudzbineMapper();
        List<StavkaPorudzbine> stavke = request.getStavke().stream()
            .map(s -> stavkaMapper.toEntity(s))
            .collect(Collectors.toList());
        
        Porudzbina sacuvana = porudzbinaService.saveWithStavke(porudzbina, stavke);
        return ResponseEntity.ok(mapper.toDto(sacuvana));
    } catch (Exception e) {
        e.printStackTrace();
        return ResponseEntity.status(500).body("Porudzbina nije mogla da bude sacuvana: " + e.getMessage());
    }
}
}