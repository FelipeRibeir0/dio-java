package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.time.LocalDate;

/**
 * Unit test for simple App.
 */

public class PessoaTest {

    @Test
    public void testGetNome() {
        // Arrange
        Pessoa pessoa = new Pessoa("Felipe", LocalDate.of(2000, 1, 1));

        // Act
        String nome = pessoa.getNome();

        // Assert
        Assertions.assertEquals("Felipe", nome, "O nome deve ser Felipe");
    }

    @Test
    public void testGetNascimento() {
        // Arrange
        LocalDate nascimentoEsperado = LocalDate.of(2000, 1, 1);
        Pessoa pessoa = new Pessoa("Felipe", nascimentoEsperado);

        // Act
        LocalDate nascimento = pessoa.getNascimento();

        // Assert
        Assertions.assertEquals(nascimentoEsperado, nascimento, "A data de nascimento deve ser 2000-01-01");
    }

    @Test
    public void testGetIdade() {
        // Arrange
        Pessoa pessoa = new Pessoa("Felipe", LocalDate.of(2000, 1, 1));

        // Act
        int idade = pessoa.getIdade();

        // Assert
        int idadeEsperada = LocalDate.now().getYear() - 2000;
        Assertions.assertEquals(idadeEsperada, idade, "A idade deve estar correta baseada na data de nascimento");
    }

}
