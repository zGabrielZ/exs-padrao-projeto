package br.com.gabrielferreira.figura.util;

import br.com.gabrielferreira.figura.model.Circulo;
import br.com.gabrielferreira.figura.model.Retangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalcularAreaTest {

    @Test
    @DisplayName("Deve calcular a área de um circulo")
    void deveCalcularAreaCirculo() {
        Circulo circulo = new Circulo(2.0);

        double area = CalcularArea.calcular(circulo);

        Assertions.assertEquals(12.56, area, 0.01);
    }

    @Test
    @DisplayName("Deve calcular a área de um retângulo")
    void deveCalcularAreaRetangulo() {
        Retangulo retangulo = new Retangulo(2.0, 3.0);

        double area = CalcularArea.calcular(retangulo);

        Assertions.assertEquals(6.0, area, 0.01);
    }
}
