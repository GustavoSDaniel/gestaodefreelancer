package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.enums.Documento;
import com.devgustavodaniel.gestaodefreelancer.enums.TipoDePerfil;
import jakarta.persistence.Entity;

@Entity
public class Freelancer extends Usuario{

    public boolean validandoPerfilFreelancer(){
        return getPerfilPrincipal() == TipoDePerfil.FREELANCER;
    }

    public boolean validandoDocumentoFreelancer(){
        return getDocumento() == Documento.CNPJ;
    }

    public Freelancer() {
    }

    public Freelancer(String nomeCompleto, Documento documento, String email, String senha, TipoDePerfil perfilPrincipal, boolean cliente, boolean freelancer, boolean cnpj, boolean cpf) {
        super(nomeCompleto, documento, email, senha, perfilPrincipal, cliente, freelancer, cnpj, cpf);
    }

}
