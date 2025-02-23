package br.com.gabrielferreira.notafiscal.imposto.impl;

import br.com.gabrielferreira.notafiscal.factory.NotaFiscalFactory;
import br.com.gabrielferreira.notafiscal.factory.impl.NotaFiscalPessoaFisicaImpl;
import br.com.gabrielferreira.notafiscal.imposto.CalcularImposto;

public class CalcularImpostoPessoaFisicaImpl extends CalcularImposto {

    @Override
    protected NotaFiscalFactory criarNotaFiscal() {
        return new NotaFiscalPessoaFisicaImpl();
    }
}
