package br.com.gabrielferreira.seguro.service;

import br.com.gabrielferreira.seguro.model.Cliente;

import java.math.BigDecimal;

public interface CalculadoraPremioSeguro {

    BigDecimal calcular(Cliente cliente, BigDecimal valorVeiculo);
}


