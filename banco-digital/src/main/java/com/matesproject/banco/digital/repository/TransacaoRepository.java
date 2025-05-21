package com.matesproject.banco.digital.repository;

import com.matesproject.banco.digital.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    
    List<Transacao> findByContaIdOrderByDataDesc (Long contaId);                   // filtro + novo >>> + antigo
    List<Transacao> findByTipoAndContaId (String tipo, Long contaId);              // filtro Tipo.Trans Conta
    List<Transacao> findByContaIdAndDataBetween(Long contaID, LocalDateTime inicio, LocalDateTime fim);  // Extrato por data
    List<Transacao> countByContaIdAndTipo(Long contaid, String tipo);              // filtro limite saque
    List<Transacao> findByValorGreaterThan(BigDecimal valor);                      // Trans/Saque Suspeito
}