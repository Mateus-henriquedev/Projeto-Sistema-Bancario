package com.matesproject.banco.digital.repository;

import com.matesproject.banco.digital.model.Comprovante; // Importe a entidade correta
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprovanteRepository extends JpaRepository<Comprovante, Long> {
   
}