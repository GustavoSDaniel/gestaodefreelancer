package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.enums.Documento;
import com.devgustavodaniel.gestaodefreelancer.enums.TipoDePerfil;

public class Cliente extends Usuario{

    public boolean validandoPerfilCliente() {
        return getPerfilPrincipal() == TipoDePerfil.CLIENTE;

    }

    public boolean validandoDocumento(Documento documento){
        return getDocumento() == Documento.CPF;
    }

    public Cliente() {
    }

    public Cliente(String nomeCompleto, Documento documento, String email, String senha, TipoDePerfil perfilPrincipal, boolean cliente, boolean freelancer, boolean cnpj, boolean cpf) {
        super(nomeCompleto, documento, email, senha, perfilPrincipal, cliente, freelancer, cnpj, cpf);
    }

}
