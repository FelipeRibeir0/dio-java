package com.exemplo;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] segundoLancamento = {2,3,5,6,8,10,11,13,17,18};
        int[] terceiroLancamento = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        // Vai passar no teste
        assertArrayEquals(primeiroLancamento,terceiroLancamento);

        //Não vai passar no teste
        assertArrayEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Felipe", LocalDate.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarMesmoValor(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor,outroValor);
    }
}
