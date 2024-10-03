package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456",500);
        Conta contaDestino = new Conta("654321",43);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

//        Assertions.assertThrows(IllegalArgumentException.class, () ->
//                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -30));

        Assertions.assertDoesNotThrow(()-> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 1));
    }
}
