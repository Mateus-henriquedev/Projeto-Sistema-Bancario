package com.matesproject.banco.digital.repository;

import com.matesproject.banco.digital.model.Comprovante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprovanteRepository extends JpaRepository<Comprovante, Long> {
}