package com.matesproject.banco.digital.model;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Agencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 

    @Column(nullable = false)
    private String nome; 

    @Column(nullable = false, unique = true)
    private String numero; 

    @Column(nullable = false)
    private String endereco; 

} 



