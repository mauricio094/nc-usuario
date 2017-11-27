package com.ncusuario.templates.domains;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.ncusuario.domains.Usuario;

import static com.ncusuario.templates.FixtureCoreTemplates.VALID;


public class UsuarioTemplate implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(Usuario.class).addTemplate(VALID.name(), new Rule() {
            {
                add("email", random("Macau@hotmail.com", "Maria@hotmail.com"));
                add("nome", random("Macau", "Maria"));
                add("senha", random("Macau123", "Maria321"));
            }
        });
    }
}
