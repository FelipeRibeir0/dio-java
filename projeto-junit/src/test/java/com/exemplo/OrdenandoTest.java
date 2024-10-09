package com.exemplo;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenandoTest {
    @Order(1)
    @Test
    void validarFluxoA(){
        System.out.println("Teste A realizado");
        Assertions.assertEquals(10, 4+4+2);
    }

    @Order(4)
    @Test
    void validarFluxoB(){
        System.out.println("Teste B realizado");
    Assertions.assertTrue(!false);
    }

    @Order(2)
    @Test
    void validarFluxoC(){
        System.out.println("Teste C realizado");
        Assertions.assertNull(null);
    }

    @Order(3)
    @Test
    void validarFluxoD(){
        System.out.println("Teste D realizado");
    Assertions.assertNotEquals(10,4+4);
    }
}
