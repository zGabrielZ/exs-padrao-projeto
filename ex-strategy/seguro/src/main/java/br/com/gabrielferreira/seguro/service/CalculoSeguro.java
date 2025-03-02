package br.com.gabrielferreira.seguro.service;

import br.com.gabrielferreira.seguro.model.Cliente;
import br.com.gabrielferreira.seguro.service.impl.CalculadoraPremioSeguroParaCarro;
import br.com.gabrielferreira.seguro.service.impl.CalculadoraPremioSeguroParaMoto;

import java.math.BigDecimal;

public enum CalculoSeguro {
    CARRO {
        @Override
        public BigDecimal calcular(Cliente cliente, BigDecimal valorVeiculo) {
            CalculadoraPremioSeguro calculadoraPremioSeguro = new CalculadoraPremioSeguroParaCarro();
            return calculadoraPremioSeguro.calcular(cliente, valorVeiculo);
        }
    },
    MOTO {
        @Override
        public BigDecimal calcular(Cliente cliente, BigDecimal valorVeiculo) {
            CalculadoraPremioSeguro calculadoraPremioSeguro = new CalculadoraPremioSeguroParaMoto();
            return calculadoraPremioSeguro.calcular(cliente, valorVeiculo);
        }
    };

    public abstract BigDecimal calcular(Cliente cliente, BigDecimal valorVeiculo);
}
