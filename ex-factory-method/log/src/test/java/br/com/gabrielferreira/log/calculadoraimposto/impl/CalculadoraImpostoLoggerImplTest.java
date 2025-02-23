package br.com.gabrielferreira.log.calculadoraimposto.impl;

import br.com.gabrielferreira.log.calculadoraimposto.CalculadoraImposto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CalculadoraImpostoLoggerImplTest {

    private CalculadoraImposto calculadoraImposto;

    @BeforeEach
    void setUp() {
        calculadoraImposto = new CalculadoraImpostoLoggerImpl();
    }

    @Test
    @DisplayName("Deve calcular imposto com o log logger")
    void deveCalcularImpostoComLogConsole() {
        calculadoraImposto.calcular(BigDecimal.valueOf(100.00));
        Assertions.assertEquals(BigDecimal.valueOf(90.00).setScale(2, RoundingMode.HALF_EVEN),
                calculadoraImposto.getValorCalculadoAposImposto().setScale(2, RoundingMode.HALF_EVEN));
    }
}
