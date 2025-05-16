package com.devgustavodaniel.gestaodefreelancer.usuario;

import com.devgustavodaniel.gestaodefreelancer.enums.Documento;
import com.devgustavodaniel.gestaodefreelancer.enums.TipoDePerfil;

public record UsuarioResponseDTO(
        Long id,
        String nomeCompleto,
        Documento documento,
        String email,
        String senha,
        TipoDePerfil tipoDePerfil,
        Boolean cliente,
        Boolean freelancer,
        Boolean cnpj,
        Boolean cpf
) {
}
