package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.enums.StatusDoProjeto;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private StatusDoProjeto statusDoProjeto = StatusDoProjeto.ABERTO;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;;
    @OneToMany(mappedBy = "projeto")
    private List<Proposta> propostaList = new ArrayList<>();

    public Projeto() {
    }

    public Projeto(Cliente cliente, String descricao, BigDecimal orcamento, LocalDate prazoDoProjeto, List<Proposta> propostaList, StatusDoProjeto statusDoProjeto, String titulo) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.prazoDoProjeto = prazoDoProjeto;
        this.propostaList = propostaList;
        this.statusDoProjeto = statusDoProjeto;
        this.titulo = titulo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento) {
        this.orcamento = orcamento;
    }

    public LocalDate getPrazoDoProjeto() {
        return prazoDoProjeto;
    }

    public void setPrazoDoProjeto(LocalDate prazoDoProjeto) {
        this.prazoDoProjeto = prazoDoProjeto;
    }

    public List<Proposta> getPropostaList() {
        return propostaList;
    }

    public void setPropostaList(List<Proposta> propostaList) {
        this.propostaList = propostaList;
    }

    public StatusDoProjeto getStatusDoProjeto() {
        return statusDoProjeto;
    }

    public void setStatusDoProjeto(StatusDoProjeto statusDoProjeto) {
        this.statusDoProjeto = statusDoProjeto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
