package com.devgustavodaniel.gestaodefreelancer.cliente;

import com.devgustavodaniel.gestaodefreelancer.enums.Documento;
import com.devgustavodaniel.gestaodefreelancer.enums.TipoDePerfil;
import com.devgustavodaniel.gestaodefreelancer.projeto.Projeto;
import com.devgustavodaniel.gestaodefreelancer.usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {

    @OneToMany(mappedBy = "cliente")
    private List<Projeto> projetoList = new ArrayList<>();

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
