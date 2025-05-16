package com.devgustavodaniel.gestaodefreelancer.usuario;

public class UsuarioMapper {

    public UsuarioResponseDTO usuarioResponseDTO(Usuario usuario){
        if (usuario == null){
            return null;
        }

        return new UsuarioResponseDTO( //Tem que ser na mesma ordem que o UsuarioResponseDTO
                usuario.getId(),
                usuario.getNomeCompleto(),
                usuario.getDocumento(),
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.getPerfilPrincipal(),
                usuario.isCliente(),
                usuario.isFreelancer(),
                usuario.isCpf(),
                usuario.isCnpj()
        );
    }
}
