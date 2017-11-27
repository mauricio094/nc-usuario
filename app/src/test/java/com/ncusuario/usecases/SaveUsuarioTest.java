package com.ncusuario.usecases;

import br.com.six2six.fixturefactory.Fixture;
import com.ncusuario.domains.Usuario;
import com.ncusuario.gateways.UsuarioGateway;
import com.ncusuario.templates.FixtureCoreTemplates;
import com.ncusuario.testsupport.TestSupport;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class SaveUsuarioTest extends TestSupport {

    @InjectMocks
    private SaveUsuario saveUsuario;
    @Mock
    private UsuarioGateway usuarioGateway;

    private Usuario usuario;

    @Override
    public void init() throws Exception {
        usuario = Fixture.from(Usuario.class).gimme(FixtureCoreTemplates.VALID.name());
    }

    @Test
    public void userShouldBeSaved() throws Exception {

        saveUsuario.execute(usuario);
        Mockito.verify(usuarioGateway).save(usuario);

    }
}
