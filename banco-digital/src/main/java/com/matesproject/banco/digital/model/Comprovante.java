package com.matesproject.banco.digital.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Comprovante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "transacao_id", nullable = false)
    private Transacao transacao;

    @Column(nullable = false)
    private String arquivoUrl;

    @Column(nullable = false)
    private LocalDateTime data;

}
