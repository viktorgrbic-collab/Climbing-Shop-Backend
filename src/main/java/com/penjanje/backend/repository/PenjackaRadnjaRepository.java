package com.penjanje.backend.repository;
import com.penjanje.backend.entity.impl.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenjackaRadnjaRepository extends JpaRepository<PenjackaRadnja, Long> {
}