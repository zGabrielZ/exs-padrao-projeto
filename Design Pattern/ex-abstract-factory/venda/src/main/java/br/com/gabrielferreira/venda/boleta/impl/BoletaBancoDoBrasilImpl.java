package br.com.gabrielferreira.venda.boleta.impl;

import br.com.gabrielferreira.venda.boleta.Boleta;
import br.com.gabrielferreira.venda.produto.Produto;

public class BoletaBancoDoBrasilImpl implements Boleta {

    @Override
    public String emitirBoletoBancario(Produto produto) {
        return  "Boleto bancário gerado pelo Banco do Brasil \n" +
                "Nome do produto: " + produto.getDescricao() + " \n" +
                "Valor bruto do produto: " + produto.getValor() + " \n" +
                "Valor após o cálculo do imposto: " + produto.getValorLiquido();
    }
}
