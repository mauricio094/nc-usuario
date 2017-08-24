package com.ncusuario.gateways.http.resources.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class UsuarioResponse {

    private String email;
    private String nome;
    private String senha;

    public UsuarioResponse(final UsuarioResponse usuario) {
        setEmail(usuario.getEmail());
        setNome(usuario.getNome());
        setSenha(usuario.getSenha());
    }
}
