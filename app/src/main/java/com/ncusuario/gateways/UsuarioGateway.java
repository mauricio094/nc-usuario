package com.ncusuario.gateways;

import com.ncusuario.domains.Usuario;

public interface UsuarioGateway {

    Usuario save(Usuario usuario);

    Usuario findByEmail(String email);
}
