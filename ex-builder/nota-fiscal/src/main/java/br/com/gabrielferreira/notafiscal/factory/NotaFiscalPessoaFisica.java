package br.com.gabrielferreira.notafiscal.factory;

import br.com.gabrielferreira.notafiscal.model.NotaFiscal;

import java.math.BigDecimal;

public class NotaFiscalPessoaFisica implements NotaFiscalFactory {

    private static final BigDecimal TAXA_IMPOSTO = BigDecimal.valueOf(0.07);

    @Override
    public BigDecimal calcularImpostoNotaFiscal(NotaFiscal notaFiscal) {
        BigDecimal valorImposto = notaFiscal.getValorTotal().multiply(TAXA_IMPOSTO);
        return notaFiscal.getValorTotal().subtract(valorImposto);
    }
}
