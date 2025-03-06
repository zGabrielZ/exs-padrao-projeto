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

class CalculadoraPremioSeguroParaMotoImplTest {

    private CalculadoraPremioSeguro calculadoraPremioSeguro;

    @BeforeEach
    void setUp() {
        calculadoraPremioSeguro = new CalculadoraPremioSeguroParaMoto();
    }

    @Test
    @DisplayName("Deve calcular o valor do seguro para uma moto")
    void deveCalcularValorSeguroParaMoto() {
        Cliente cliente = new Cliente("João da Silva", LocalDate.of(1990, 1, 1), Sexo.MASCULINO, null);
        BigDecimal valorVeiculo = BigDecimal.valueOf(500.00);

        BigDecimal valorTotal = calculadoraPremioSeguro.calcular(cliente, valorVeiculo);
        Assertions.assertEquals(BigDecimal.valueOf(515.00).setScale(2, RoundingMode.HALF_EVEN), valorTotal.setScale(2, RoundingMode.HALF_EVEN));
    }
}
