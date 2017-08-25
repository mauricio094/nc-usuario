package com.ncusuario.gateways.http.resources.response;

import com.ncusuario.domains.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class UsuarioResponse {

    private String email;
    private String nome;
    private String senha;

    public UsuarioResponse(final Usuario usuario) {
        setEmail(usuario.getEmail());
        setNome(usuario.getNome());
        setSenha(usuario.getSenha());
    }

    public static List<UsuarioResponse> toList(final List<Usuario> listUsuarios) {
        return listUsuarios.stream().map(UsuarioResponse::new).collect(Collectors.toList());
    }

}
