package br.com.gabrielferreira.notafiscal.imposto;

import br.com.gabrielferreira.notafiscal.factory.NotaFiscalFactory;
import br.com.gabrielferreira.notafiscal.model.NotaFiscal;

import java.math.BigDecimal;

public abstract class CalcularImposto {

    protected abstract NotaFiscalFactory criarNotaFiscal();

    public BigDecimal calcularImposto(NotaFiscal notaFiscal) {
        return criarNotaFiscal().calcularImpostoNotaFiscal(notaFiscal);
    }
}
