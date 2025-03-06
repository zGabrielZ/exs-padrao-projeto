package br.com.gabrielferreira.notafiscal.factory;

import br.com.gabrielferreira.notafiscal.model.NotaFiscal;

import java.math.BigDecimal;

public interface NotaFiscalFactory {

    BigDecimal calcularImpostoNotaFiscal(NotaFiscal notaFiscal);
}
