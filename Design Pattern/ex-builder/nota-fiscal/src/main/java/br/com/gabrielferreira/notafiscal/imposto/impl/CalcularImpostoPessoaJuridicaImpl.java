package br.com.gabrielferreira.notafiscal.imposto.impl;

import br.com.gabrielferreira.notafiscal.factory.NotaFiscalFactory;
import br.com.gabrielferreira.notafiscal.factory.impl.NotaFiscalPessoaJuridicaImpl;
import br.com.gabrielferreira.notafiscal.imposto.CalcularImposto;

public class CalcularImpostoPessoaJuridicaImpl extends CalcularImposto {

    @Override
    protected NotaFiscalFactory criarNotaFiscal() {
        return new NotaFiscalPessoaJuridicaImpl();
    }
}
