package br.com.gabrielferreira.seguro.service.impl;

import br.com.gabrielferreira.seguro.model.Cliente;
import br.com.gabrielferreira.seguro.service.CalculoSeguro;
import br.com.gabrielferreira.seguro.service.PropostaSeguro;

import java.math.BigDecimal;

public class PropostaSeguroImpl implements PropostaSeguro {

    private final Cliente cliente;

    public PropostaSeguroImpl(Cliente cliente, BigDecimal valorVeiculo, CalculoSeguro calculoSeguro) {
        this.cliente = cliente;
        calculoSeguro.calcular(cliente, valorVeiculo);
    }

    @Override
    public String gerar() {
        return  "Proposta de seguro para o cliente: " + "\n" +
                "Nome: " + cliente.getNome() + "\n" +
                "Data de nascimento: " + cliente.getDataNascimento() + "\n" +
                "Sexo: " + cliente.getSexo() + "\n" +
                "Valor do seguro: " + cliente.getValorSeguro();
    }
}
