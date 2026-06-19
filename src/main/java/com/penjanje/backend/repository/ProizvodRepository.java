package com.penjanje.backend.repository;
import java.util.List;
import com.penjanje.backend.entity.impl.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProizvodRepository extends JpaRepository<Proizvod, Long> {
    List<Proizvod> findByNazivContaining(String naziv);
}