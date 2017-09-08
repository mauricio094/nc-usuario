package com.ncusuario.gateways.http.resources.request;

import com.ncusuario.domains.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {

    @NotEmpty
    private String email;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String senha;

    public Usuario toDomain() {
        Usuario usuario = new Usuario();
        usuario.setEmail(this.getEmail());
        usuario.setNome(this.getNome());
        usuario.setSenha(this.getSenha());
        return usuario;
    }
}
