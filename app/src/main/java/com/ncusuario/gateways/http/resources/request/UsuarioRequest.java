package com.ncusuario.gateways.http.resources.request;

import com.ncusuario.domains.Usuario;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class UsuarioRequest {

    @NotNull(message = "{validation.field.notnull}")
    private String email;

    @NotNull(message = "{validation.field.notnull}")
    private String nome;

    @NotNull(message = "{validation.field.notnull}")
    private String senha;

    public Usuario toDomain() {
        Usuario usuario = new Usuario();
        usuario.setEmail(this.getEmail());
        usuario.setNome(this.getNome());
        usuario.setNome(this.getSenha());
        return usuario;
    }
}
