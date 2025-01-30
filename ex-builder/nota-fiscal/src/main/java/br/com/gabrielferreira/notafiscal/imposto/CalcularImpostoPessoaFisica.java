package br.com.gabrielferreira.notafiscal.imposto;

import br.com.gabrielferreira.notafiscal.factory.NotaFiscalFactory;
import br.com.gabrielferreira.notafiscal.factory.NotaFiscalPessoaFisica;

public class CalcularImpostoPessoaFisica extends CalcularImposto {

    @Override
    protected NotaFiscalFactory criarNotaFiscal() {
        return new NotaFiscalPessoaFisica();
    }
}
