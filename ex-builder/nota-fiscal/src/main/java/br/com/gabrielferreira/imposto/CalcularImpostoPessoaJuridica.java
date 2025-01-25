package br.com.gabrielferreira.imposto;

import br.com.gabrielferreira.factory.NotaFiscalFactory;
import br.com.gabrielferreira.factory.NotaFiscalPessoaJuridica;

public class CalcularImpostoPessoaJuridica extends CalcularImposto {

    @Override
    protected NotaFiscalFactory criarNotaFiscal() {
        return new NotaFiscalPessoaJuridica();
    }
}
