package com.ncusuario.gateways.mongodb;

import com.ncusuario.domains.Usuario;
import com.ncusuario.gateways.UsuarioGateway;
import com.ncusuario.gateways.mongodb.repositories.UsuarioRepository;

public class UsuarioGatewayImpl implements UsuarioGateway {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findByEmail(String email) {
        return usuarioRepository.findOne(email);
    }
}
