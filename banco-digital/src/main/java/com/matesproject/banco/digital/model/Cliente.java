package com.matesproject.banco.digital.model;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.security.core.annotation.CurrentSecurityContext;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private long Id; 
    
    @Column(nullable = false)
    private String nome; 

    @Column(nullable = false, unique = true)
    private String emaiil; 

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

}
