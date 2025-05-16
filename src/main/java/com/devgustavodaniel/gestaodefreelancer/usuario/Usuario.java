package com.devgustavodaniel.gestaodefreelancer.usuario;

import com.devgustavodaniel.gestaodefreelancer.enums.Documento;
import com.devgustavodaniel.gestaodefreelancer.enums.TipoDePerfil;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // cada classe na hierarquia (a superclasse e suas subclasses) é mapeada para sua própria tabela no banco de dados
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_completo", nullable = false)
    private String nomeCompleto;
    @Enumerated(EnumType.STRING)
    private Documento documento;
    @Column(unique = true)
    private String email;
    private String senha;
    @Enumerated(EnumType.STRING)
    private TipoDePerfil perfilPrincipal;
    private Boolean cliente;
    private Boolean freelancer;
    private Boolean cnpj;
    private Boolean cpf;

    public Usuario() {
    }

    public Usuario(String nomeCompleto, Documento documento, String email, String senha, TipoDePerfil perfilPrincipal, boolean cliente, boolean freelancer, boolean cnpj, boolean cpf) {
        this.nomeCompleto = nomeCompleto;
        this.documento = documento;
        this.email = email;
        this.senha = senha;
        this.perfilPrincipal = perfilPrincipal;
        this.cliente = cliente;
        this.freelancer = freelancer;
        this.cnpj = cnpj;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoDePerfil getPerfilPrincipal() {
        return perfilPrincipal;
    }

    public void setPerfilPrincipal(TipoDePerfil perfilPrincipal) {
        this.perfilPrincipal = perfilPrincipal;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public boolean isFreelancer() {
        return freelancer;
    }

    public void setFreelancer(boolean freelancer) {
        this.freelancer = freelancer;
    }

    public boolean isCnpj() {
        return cnpj;
    }

    public void setCnpj(boolean cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isCpf() {
        return cpf;
    }

    public void setCpf(boolean cpf) {
        this.cpf = cpf;
    }
}
