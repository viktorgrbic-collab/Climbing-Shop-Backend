package com.penjanje.backend.repository;
import com.penjanje.backend.entity.impl.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RadnjaProizvodRepository extends JpaRepository<RadnjaProizvod, Long> {
    List<RadnjaProizvod> findByPenjackaRadnja(PenjackaRadnja penjackaRadnja);
    List<RadnjaProizvod> findByProizvod(Proizvod proizvod);
}