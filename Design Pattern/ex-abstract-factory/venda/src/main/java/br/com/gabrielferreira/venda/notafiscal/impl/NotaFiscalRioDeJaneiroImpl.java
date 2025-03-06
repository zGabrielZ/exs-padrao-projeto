package br.com.gabrielferreira.venda.notafiscal.impl;

import br.com.gabrielferreira.venda.notafiscal.NotaFiscal;
import br.com.gabrielferreira.venda.produto.Produto;

import java.math.BigDecimal;

public class NotaFiscalRioDeJaneiroImpl implements NotaFiscal {

    private static final BigDecimal IMPOSTO = BigDecimal.valueOf(0.20);

    @Override
    public void calcularImposto(Produto produto) {
        BigDecimal impostoCalculado = IMPOSTO.multiply(produto.getValor());
        BigDecimal valorCalculado = produto.getValor().add(impostoCalculado);
        produto.setValorLiquido(valorCalculado);
    }
}
