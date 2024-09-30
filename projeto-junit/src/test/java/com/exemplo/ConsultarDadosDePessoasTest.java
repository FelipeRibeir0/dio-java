package com.exemplo;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoasTest {

    @BeforeAll
   static void configuraConexao(){
    BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("Pedro", LocalDate.of(2000,1,1)));
    }

    @AfterEach
    void removeDadosParaTeste(){
        BancoDeDados.removeDados(new Pessoa("Pedro", LocalDate.of(2000,1,1)));
    }


    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
        System.out.println("Os dados são true");
    }

    @Test
    void validarDadosNumericos(){
        Assertions.assertEquals(3,3);
        System.out.println("Os numeros são os mesmos");
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
