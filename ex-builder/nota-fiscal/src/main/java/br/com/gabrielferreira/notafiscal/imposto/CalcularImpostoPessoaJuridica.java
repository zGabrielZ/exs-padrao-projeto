package br.com.gabrielferreira.notafiscal.imposto;

import br.com.gabrielferreira.notafiscal.factory.NotaFiscalFactory;
import br.com.gabrielferreira.notafiscal.factory.NotaFiscalPessoaJuridica;

public class CalcularImpostoPessoaJuridica extends CalcularImposto {

    @Override
    protected NotaFiscalFactory criarNotaFiscal() {
        return new NotaFiscalPessoaJuridica();
    }
}
