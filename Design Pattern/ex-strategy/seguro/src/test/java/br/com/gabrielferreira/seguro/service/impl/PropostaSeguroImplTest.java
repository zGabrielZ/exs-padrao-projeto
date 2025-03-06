package br.com.gabrielferreira.seguro.service.impl;

import br.com.gabrielferreira.seguro.model.Cliente;
import br.com.gabrielferreira.seguro.model.enums.Sexo;
import br.com.gabrielferreira.seguro.service.CalculoSeguro;
import br.com.gabrielferreira.seguro.service.PropostaSeguro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class PropostaSeguroImplTest {

    private PropostaSeguro propostaSeguro;

    private Cliente cliente;

    private BigDecimal valorVeiculo;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("João da Silva", LocalDate.of(1990, 1, 1), Sexo.MASCULINO, null);
        valorVeiculo = BigDecimal.valueOf(500.00);
    }

    @Test
    @DisplayName("Deve gerar proposta de seguro para uma moto")
    void deveCalcularValorSeguroParaMoto() {
        propostaSeguro = new PropostaSeguroImpl(cliente, valorVeiculo, CalculoSeguro.MOTO);
        Assertions.assertNotNull(propostaSeguro.gerar());
    }

    @Test
    @DisplayName("Deve gerar proposta de seguro para um carro")
    void deveCalcularValorSeguroParaCarro() {
        propostaSeguro = new PropostaSeguroImpl(cliente, valorVeiculo, CalculoSeguro.CARRO);
        Assertions.assertNotNull(propostaSeguro.gerar());
    }
}
