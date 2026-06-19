package com.penjanje.backend.controller;

import com.penjanje.backend.JwtUtil;
import com.penjanje.backend.entity.impl.Korisnik;
import com.penjanje.backend.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private KorisnikService korisnikService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");

        Korisnik korisnik = korisnikService.findByUsername(username);

        if (korisnik == null || !korisnik.getPassword().equals(password)) {
            Map<String, String> error = new HashMap<>();
            error.put("error", "Pogresno korisnicko ime ili lozinka!");
            return ResponseEntity.status(401).body(error);
        }

        String token = jwtUtil.generateToken(username);

        Map<String, Object> response = new HashMap<>();
        response.put("token", token);
        response.put("korisnikID", korisnik.getKorisnikID());
        response.put("username", korisnik.getUsername());
        response.put("ime", korisnik.getIme());
        response.put("uloga", korisnik.getUloga());
        response.put("adresa", korisnik.getAdresa());
        return ResponseEntity.ok(response);
    }
}