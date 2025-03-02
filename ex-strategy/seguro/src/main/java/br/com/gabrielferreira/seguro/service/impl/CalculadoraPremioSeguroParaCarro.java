package br.com.gabrielferreira.seguro.service.impl;

import br.com.gabrielferreira.seguro.model.Cliente;
import br.com.gabrielferreira.seguro.service.CalculadoraPremioSeguro;

import java.math.BigDecimal;

public class CalculadoraPremioSeguroParaCarro implements CalculadoraPremioSeguro {

    // Valor fixo de 5% para o seguro de carro
    private static final BigDecimal TAXA_SEGURO_CARRO = new BigDecimal("0.05");

    @Override
    public BigDecimal calcular(Cliente cliente, BigDecimal valorVeiculo) {
        BigDecimal valorSeguro = valorVeiculo.add((valorVeiculo.multiply(TAXA_SEGURO_CARRO)));
        cliente.setValorSeguro(valorSeguro);
        return valorSeguro;
    }
}
