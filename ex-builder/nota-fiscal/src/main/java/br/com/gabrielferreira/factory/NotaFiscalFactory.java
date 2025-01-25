package br.com.gabrielferreira.factory;

import br.com.gabrielferreira.model.NotaFiscal;

import java.math.BigDecimal;

public interface NotaFiscalFactory {

    BigDecimal calcularImpostoNotaFiscal(NotaFiscal notaFiscal);
}
