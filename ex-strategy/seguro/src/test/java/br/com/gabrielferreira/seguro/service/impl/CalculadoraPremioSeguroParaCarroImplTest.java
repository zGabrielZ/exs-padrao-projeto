package br.com.gabrielferreira.seguro.service.impl;

import br.com.gabrielferreira.seguro.model.Cliente;
import br.com.gabrielferreira.seguro.model.enums.Sexo;
import br.com.gabrielferreira.seguro.service.CalculadoraPremioSeguro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

class CalculadoraPremioSeguroParaCarroImplTest {

    private CalculadoraPremioSeguro calculadoraPremioSeguro;

    @BeforeEach
    void setUp() {
        calculadoraPremioSeguro = new CalculadoraPremioSeguroParaCarro();
    }

    @Test
    @DisplayName("Deve calcular o valor do seguro para um carro")
    void deveCalcularValorSeguroParaCarro() {
        Cliente cliente = new Cliente("João da Silva", LocalDate.of(1990, 1, 1), Sexo.MASCULINO, null);
        BigDecimal valorVeiculo = BigDecimal.valueOf(1000.00);

        BigDecimal valorTotal = calculadoraPremioSeguro.calcular(cliente, valorVeiculo);
        Assertions.assertEquals(BigDecimal.valueOf(1050.00).setScale(2, RoundingMode.HALF_EVEN), valorTotal.setScale(2, RoundingMode.HALF_EVEN));
    }
}
