package com.devgustavodaniel.gestaodefreelancer.proposta;

import com.devgustavodaniel.gestaodefreelancer.enums.StatusProposta;
import com.devgustavodaniel.gestaodefreelancer.freelancer.Freelancer;
import com.devgustavodaniel.gestaodefreelancer.projeto.Projeto;
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
    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;
    @Enumerated(EnumType.STRING)
    private StatusProposta statusProposta = StatusProposta.PENDENTE;

    public Proposta() {
    }

    public Proposta(Freelancer freelancer, LocalDate prazoDeEntrega, Projeto projeto, StatusProposta statusProposta, BigDecimal valorOfertado) {
        this.freelancer = freelancer;
        this.prazoDeEntrega = prazoDeEntrega;
        this.projeto = projeto;
        this.statusProposta = statusProposta;
        this.valorOfertado = valorOfertado;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getPrazoDeEntrega() {
        return prazoDeEntrega;
    }

    public void setPrazoDeEntrega(LocalDate prazoDeEntrega) {
        this.prazoDeEntrega = prazoDeEntrega;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public StatusProposta getStatusProposta() {
        return statusProposta;
    }

    public void setStatusProposta(StatusProposta statusProposta) {
        this.statusProposta = statusProposta;
    }

    public BigDecimal getValorOfertado() {
        return valorOfertado;
    }

    public void setValorOfertado(BigDecimal valorOfertado) {
        this.valorOfertado = valorOfertado;
    }
}
