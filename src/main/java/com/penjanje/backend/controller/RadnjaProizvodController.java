package com.penjanje.backend.controller;

import com.penjanje.backend.dto.impl.RadnjaProizvodDto;
import com.penjanje.backend.entity.impl.RadnjaProizvod;
import com.penjanje.backend.mapper.impl.RadnjaProizvodMapper;
import com.penjanje.backend.service.RadnjaProizvodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/radnja-proizvod")
@CrossOrigin(origins = "http://localhost:3000")
public class RadnjaProizvodController {

    @Autowired
    private RadnjaProizvodService radnjaProizvodService;

    private RadnjaProizvodMapper mapper = new RadnjaProizvodMapper();

    @GetMapping
    public List<RadnjaProizvodDto> getAll() {
        return radnjaProizvodService.getAll()
            .stream()
            .map(rp -> mapper.toDto(rp))
            .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public RadnjaProizvodDto getById(@PathVariable Long id) {
        return mapper.toDto(radnjaProizvodService.getById(id));
    }

    @PostMapping
    public RadnjaProizvodDto save(@RequestBody RadnjaProizvodDto dto) {
        RadnjaProizvod rp = mapper.toEntity(dto);
        return mapper.toDto(radnjaProizvodService.save(rp));
    }

    @PutMapping("/{id}")
    public RadnjaProizvodDto update(@PathVariable Long id, @RequestBody RadnjaProizvodDto dto) {
        dto.setId(id);
        RadnjaProizvod rp = mapper.toEntity(dto);
        return mapper.toDto(radnjaProizvodService.save(rp));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        radnjaProizvodService.delete(id);
    }
}