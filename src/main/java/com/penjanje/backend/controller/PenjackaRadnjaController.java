package com.penjanje.backend.controller;
import org.springframework.http.ResponseEntity;
import java.util.stream.Collectors;
import com.penjanje.backend.dto.impl.PenjackaRadnjaDto;
import com.penjanje.backend.entity.impl.PenjackaRadnja;
import com.penjanje.backend.mapper.impl.PenjackaRadnjaMapper;
import com.penjanje.backend.service.PenjackaRadnjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/radnje")
@CrossOrigin(origins = "http://localhost:3000")
public class PenjackaRadnjaController {

    @Autowired
    private PenjackaRadnjaService penjackaRadnjaService;

    private PenjackaRadnjaMapper mapper = new PenjackaRadnjaMapper();

    @GetMapping
    public List<PenjackaRadnjaDto> getAll() {
        return penjackaRadnjaService.getAll()
            .stream()
            .map(r -> mapper.toDto(r))
            .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PenjackaRadnjaDto getById(@PathVariable Long id) {
        return mapper.toDto(penjackaRadnjaService.getById(id));
    }

    @PostMapping
public ResponseEntity<?> save(@RequestBody PenjackaRadnjaDto dto) {
    try {
        PenjackaRadnja r = mapper.toEntity(dto);
        return ResponseEntity.ok(mapper.toDto(penjackaRadnjaService.save(r)));
    } catch (Exception e) {
        return ResponseEntity.status(500).body("Radnja nije mogla da bude sacuvana.");
    }
}

    @PutMapping("/{id}")
    public PenjackaRadnjaDto update(@PathVariable Long id, @RequestBody PenjackaRadnjaDto dto) {
        dto.setPenjackaRadnjaID(id);
        PenjackaRadnja r = mapper.toEntity(dto);
        return mapper.toDto(penjackaRadnjaService.save(r));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        penjackaRadnjaService.delete(id);
    }
}