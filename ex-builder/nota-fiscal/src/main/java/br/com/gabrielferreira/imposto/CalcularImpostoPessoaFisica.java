package br.com.gabrielferreira.imposto;

import br.com.gabrielferreira.factory.NotaFiscalFactory;
import br.com.gabrielferreira.factory.NotaFiscalPessoaFisica;

public class CalcularImpostoPessoaFisica extends CalcularImposto {

    @Override
    protected NotaFiscalFactory criarNotaFiscal() {
        return new NotaFiscalPessoaFisica();
    }
}
