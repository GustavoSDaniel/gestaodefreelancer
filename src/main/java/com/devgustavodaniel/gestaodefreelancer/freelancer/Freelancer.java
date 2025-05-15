package com.devgustavodaniel.gestaodefreelancer.freelancer;

import com.devgustavodaniel.gestaodefreelancer.enums.Documento;
import com.devgustavodaniel.gestaodefreelancer.enums.TipoDePerfil;
import com.devgustavodaniel.gestaodefreelancer.proposta.Proposta;
import com.devgustavodaniel.gestaodefreelancer.usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "freelancer")
public class Freelancer extends Usuario {

    @OneToMany(mappedBy = "freelancer")
    private List<Proposta> propostas = new ArrayList<>();

    public boolean validandoPerfilFreelancer(){
        return getPerfilPrincipal() == TipoDePerfil.FREELANCER;
    }

    public boolean validandoDocumentoFreelancer(){
        return getDocumento() == Documento.CNPJ;
    }

    public Freelancer() {
    }

    public Freelancer(List<Proposta> propostas) {
        this.propostas = propostas;
    }

    public Freelancer(String nomeCompleto, Documento documento, String email, String senha, TipoDePerfil perfilPrincipal, boolean cliente, boolean freelancer, boolean cnpj, boolean cpf, List<Proposta> propostas) {
        super(nomeCompleto, documento, email, senha, perfilPrincipal, cliente, freelancer, cnpj, cpf);
        this.propostas = propostas;
    }
}
