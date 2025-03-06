package br.com.gabrielferreira.colecao.violation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ViolationRangeTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    @DisplayName("Deve retornar verdadeiro para valor dentro do range")
    void deveRetornarVerdadeiroParaValorDentroDoRange(Integer valor) {
        Assertions.assertTrue(ViolationRange.isValid(valor));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20})
    @DisplayName("Não deve retornar verdadeiro para valor dentro do range")
    void naoDeveRetornarVerdadeiroParaValorDentroDoRange(Integer valor) {
        Assertions.assertFalse(ViolationRange.isValid(valor));
    }
}
