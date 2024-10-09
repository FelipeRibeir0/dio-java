package com.exemplo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    @Test
    @EnabledOnOs(OS.LINUX)
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void validarAlgoSomenteNoUsuarioFelipe(){
        Assumptions.assumeTrue("Felipe".equals(System.getenv("USER")));
    }
}
