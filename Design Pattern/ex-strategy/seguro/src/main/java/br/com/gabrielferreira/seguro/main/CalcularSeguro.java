package br.com.gabrielferreira.seguro.main;

import br.com.gabrielferreira.seguro.model.Cliente;
import br.com.gabrielferreira.seguro.model.enums.Sexo;
import br.com.gabrielferreira.seguro.service.CalculoSeguro;
import br.com.gabrielferreira.seguro.service.PropostaSeguro;
import br.com.gabrielferreira.seguro.service.impl.PropostaSeguroImpl;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalcularSeguro {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("José da Silva", LocalDate.of(1980, 1, 1), Sexo.MASCULINO, null);
        BigDecimal valorVeiculo = BigDecimal.valueOf(1000);

        PropostaSeguro propostaSeguro = new PropostaSeguroImpl(cliente, valorVeiculo, CalculoSeguro.CARRO);
        System.out.println(propostaSeguro.gerar());

        valorVeiculo = BigDecimal.valueOf(500);
        propostaSeguro = new PropostaSeguroImpl(cliente, valorVeiculo, CalculoSeguro.MOTO);
        System.out.println(propostaSeguro.gerar());
    }
}
