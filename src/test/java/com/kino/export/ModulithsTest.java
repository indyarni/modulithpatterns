package com.kino.export;

import com.kino.ModulithpatternsApplication;
import de.olivergierke.moduliths.model.Modules;
import de.olivergierke.moduliths.test.ModuleTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ModuleTest
public class ModulithsTest {

    @Test
    public void name() {
        Modules.of(ModulithpatternsApplication.class).verify();
    }
}
