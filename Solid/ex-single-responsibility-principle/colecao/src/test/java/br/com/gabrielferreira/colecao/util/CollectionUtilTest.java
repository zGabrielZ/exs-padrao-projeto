package br.com.gabrielferreira.colecao.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CollectionUtilTest {

    @Test
    @DisplayName("Deve ordenar a lista de inteiros")
    void deveOrdenarListaInteiros() {
        List<Integer> list = Arrays.asList(3, 1, 2, 5, 10, 4);

        List<Integer> resultado = CollectionUtil.order(list);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5, 10), resultado);
    }
}
