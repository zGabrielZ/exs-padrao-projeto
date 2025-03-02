package br.com.gabrielferreira.seguro.service.impl;

import br.com.gabrielferreira.seguro.model.Cliente;
import br.com.gabrielferreira.seguro.service.CalculadoraPremioSeguro;

import java.math.BigDecimal;

public class CalculadoraPremioSeguroParaMoto implements CalculadoraPremioSeguro {

    // Valor fixo de 3% para o seguro de moto
    private static final BigDecimal TAXA_SEGURO_MOTO = new BigDecimal("0.03");

    @Override
    public BigDecimal calcular(Cliente cliente, BigDecimal valorVeiculo) {
        BigDecimal valorSeguro = valorVeiculo.add((valorVeiculo.multiply(TAXA_SEGURO_MOTO)));
        cliente.setValorSeguro(valorSeguro);
        return valorSeguro;
    }
}
