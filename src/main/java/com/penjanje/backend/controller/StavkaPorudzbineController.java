package com.penjanje.backend.controller;
import com.penjanje.backend.entity.impl.Porudzbina;
import com.penjanje.backend.dto.impl.StavkaPorudzbineDto;
import com.penjanje.backend.entity.impl.StavkaPorudzbine;
import com.penjanje.backend.mapper.impl.StavkaPorudzbineMapper;
import com.penjanje.backend.service.StavkaPorudzbineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/stavke")
@CrossOrigin(origins = "http://localhost:3000")
public class StavkaPorudzbineController {

    @Autowired
    private StavkaPorudzbineService stavkaPorudzbineService;

    private StavkaPorudzbineMapper mapper = new StavkaPorudzbineMapper();

    @GetMapping
    public List<StavkaPorudzbineDto> getAll() {
        return stavkaPorudzbineService.getAll()
            .stream()
            .map(s -> mapper.toDto(s))
            .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public StavkaPorudzbineDto getById(@PathVariable Long id) {
        return mapper.toDto(stavkaPorudzbineService.getById(id));
    }

    @PostMapping
    public StavkaPorudzbineDto save(@RequestBody StavkaPorudzbineDto dto) {
        StavkaPorudzbine s = mapper.toEntity(dto);
        return mapper.toDto(stavkaPorudzbineService.save(s));
    }

    @PutMapping("/{id}")
    public StavkaPorudzbineDto update(@PathVariable Long id, @RequestBody StavkaPorudzbineDto dto) {
        dto.setRb(id);
        StavkaPorudzbine s = mapper.toEntity(dto);
        return mapper.toDto(stavkaPorudzbineService.save(s));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        stavkaPorudzbineService.delete(id);
    }
    
    @GetMapping("/porudzbina/{porudzbinаId}")
    public List<StavkaPorudzbineDto> getByPorudzbina(@PathVariable Long porudzbinаId) {
    Porudzbina p = new Porudzbina();
    p.setPorudzbinalD(porudzbinаId);
    return stavkaPorudzbineService.findByPorudzbina(p)
        .stream()
        .map(s -> mapper.toDto(s))
        .collect(Collectors.toList());
}
}