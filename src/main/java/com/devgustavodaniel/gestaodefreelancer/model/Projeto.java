package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.enums.StatusDoProjeto;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_projeto")
    private Long id;
    private String titulo;
    @Column(name = "descrição")
    private String descricao;
    private LocalDate prazoDoProjeto;
    private BigDecimal orcamento;
    @Enumerated(EnumType.STRING)
    private StatusDoProjeto statusDoProjeto;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;;

}
