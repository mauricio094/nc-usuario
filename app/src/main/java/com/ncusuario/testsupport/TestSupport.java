package com.ncusuario.testsupport;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public abstract class TestSupport {

    @BeforeClass
    public static void setup() {
        FixtureFactoryLoader.loadTemplates("com.ncusuario.templates");
    }

    @Before
    public abstract void init() throws Exception;
}
