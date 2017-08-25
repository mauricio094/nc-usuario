package com.ncusuario.gateways.http.resources.request;

import com.ncusuario.domains.Usuario;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class UsuarioRequest {

    @NotEmpty(message = "{validation.field.notnull}")
    private String email;

    @NotEmpty(message = "{validation.field.notnull}")
    private String nome;

    @NotEmpty(message = "{validation.field.notnull}")
    private String senha;

    public Usuario toDomain() {
        Usuario usuario = new Usuario();
        usuario.setEmail(this.getEmail());
        usuario.setNome(this.getNome());
        usuario.setSenha(this.getSenha());
        return usuario;
    }
}
