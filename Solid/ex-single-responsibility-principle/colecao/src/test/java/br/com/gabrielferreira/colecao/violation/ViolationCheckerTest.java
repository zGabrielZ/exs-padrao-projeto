package br.com.gabrielferreira.colecao.violation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ViolationCheckerTest {

    @Test
    @DisplayName("Deve retornar verdadeiro para um valor válido")
    void deveRetornarVerdadeiroParaUmValorValido() {
        String valor = "1";

        boolean resultado = ViolationChecker.isValid(valor);

        Assertions.assertTrue(resultado);
    }

    @Test
    @DisplayName("Não deve retornar verdadeiro para um valor inválido")
    void naoDeveRetornarVerdadeiroParaUmValorInvalido() {
        String valor = "aaaaaaaaa";

        boolean resultado = ViolationChecker.isValid(valor);

        Assertions.assertFalse(resultado);
    }

}
