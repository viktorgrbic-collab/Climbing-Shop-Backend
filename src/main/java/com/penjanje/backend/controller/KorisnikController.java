package com.penjanje.backend.controller;
import org.springframework.http.ResponseEntity;
import java.util.stream.Collectors;
import com.penjanje.backend.dto.impl.KorisnikDto;
import com.penjanje.backend.entity.impl.Korisnik;
import com.penjanje.backend.mapper.impl.KorisnikMapper;
import com.penjanje.backend.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/korisnici")
@CrossOrigin(origins = "http://localhost:3000")
public class KorisnikController {

    @Autowired
    private KorisnikService korisnikService;

    private KorisnikMapper mapper = new KorisnikMapper();

    @GetMapping
    public List<KorisnikDto> getAll() {
        return korisnikService.getAll()
            .stream()
            .map(k -> mapper.toDto(k))
            .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public KorisnikDto getById(@PathVariable Long id) {
        return mapper.toDto(korisnikService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody KorisnikDto dto) {
    try {
        Korisnik k = mapper.toEntity(dto);
        return ResponseEntity.ok(mapper.toDto(korisnikService.save(k)));
    } catch (Exception e) {
        return ResponseEntity.status(500).body("Korisnik nije mogao da bude sacuvan.");
    }
}

    @PutMapping("/{id}")
    public KorisnikDto update(@PathVariable Long id, @RequestBody KorisnikDto dto) {
        dto.setKorisnikID(id);
        Korisnik k = mapper.toEntity(dto);
        return mapper.toDto(korisnikService.save(k));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        korisnikService.delete(id);
    }
}