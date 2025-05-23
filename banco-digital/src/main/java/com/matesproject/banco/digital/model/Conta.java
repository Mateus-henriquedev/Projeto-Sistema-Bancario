package com.matesproject.banco.digital.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Conta {

   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id; 

   @Column(nullable = false)
    private String tipo; 

    @Column(nullable = false)
    private BigDecimal saldo = BigDecimal.ZERO; 

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente; 

    @ManyToOne
    @JoinColumn(name = "agencia_id", nullable = false)
    private Agencia agencia; 

}