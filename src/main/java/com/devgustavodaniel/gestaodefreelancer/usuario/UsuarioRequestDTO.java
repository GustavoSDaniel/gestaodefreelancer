package com.devgustavodaniel.gestaodefreelancer.usuario;

import com.devgustavodaniel.gestaodefreelancer.enums.Documento;
import com.devgustavodaniel.gestaodefreelancer.enums.TipoDePerfil;
import jakarta.validation.constraints.*;

public record UsuarioRequestDTO(
        @NotBlank(message = "Campo nome obrigatório")
        @Size(min = 3, max = 100)
        String nomeCompleto,
        @NotBlank(message = "Campo documento brigatório")
        Documento documento,
        @NotBlank(message = "Campo email obrigatório")
        @Email(message = "Formato de email inválido")
        String email,
        @NotBlank(message = "Campo senha  obrigatório")
        String senha,
        @NotBlank(message = "Campo perfil obrigatório")
        TipoDePerfil tipoDePerfil,
        @NotNull(message = "Campo Cliente obrigatório")
        Boolean cliente,
        @NotNull(message = "Campo freelancer obrigatório")
        Boolean freelancer,
        @NotNull(message = "Campo CNPJ obrigatório")
        Boolean cnpj,
        @NotNull(message = "Campo CPF obrigatório")
        Boolean cpf) {
}
