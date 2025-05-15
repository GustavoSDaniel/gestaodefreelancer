package com.devgustavodaniel.gestaodefreelancer.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "proposta")
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proposta")
    private Long id;
    private BigDecimal valorOfertado;
    private LocalDate prazoDeEntrega;
    @ManyToOne
    @JoinColumn(name = "id_freelancer")
    private Freelancer freelancer;


}
