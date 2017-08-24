package com.ncusuario.usecases;

import com.ncusuario.domains.Usuario;
import com.ncusuario.gateways.UsuarioGateway;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class FindUsuario {

    private UsuarioGateway usuarioGateway;

    public Usuario execute(final String email) {
        log.info("Finding usuario with email: {}", email);
        return usuarioGateway.findByEmail(email);
    }
}
