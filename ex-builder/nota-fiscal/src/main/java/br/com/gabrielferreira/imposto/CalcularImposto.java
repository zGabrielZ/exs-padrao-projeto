package br.com.gabrielferreira.imposto;

import br.com.gabrielferreira.factory.NotaFiscalFactory;
import br.com.gabrielferreira.model.NotaFiscal;

import java.math.BigDecimal;

public abstract class CalcularImposto {

    protected abstract NotaFiscalFactory criarNotaFiscal();

    public BigDecimal calcularImposto(NotaFiscal notaFiscal) {
        return criarNotaFiscal().calcularImpostoNotaFiscal(notaFiscal);
    }
}
