package com.ncusuario.usecases;

import com.ncusuario.domains.Usuario;
import com.ncusuario.gateways.UsuarioGateway;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class SaveUsuario {
    private UsuarioGateway usuarioGateway;

    @Async
    public void execute(final Usuario usuario) {
        log.info("Saving usuario:{}", usuario);
        usuarioGateway.save(usuario);
    }


}
