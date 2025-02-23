package br.com.gabrielferreira.log.calculadoraimposto.impl;

import br.com.gabrielferreira.log.calculadoraimposto.CalculadoraImposto;
import br.com.gabrielferreira.log.factory.LogFactory;
import br.com.gabrielferreira.log.factory.impl.LogFactoryImplArquivoTxt;

public class CalculadoraImpostoArquivoTxtImpl extends CalculadoraImposto {

    private final String saida;

    public CalculadoraImpostoArquivoTxtImpl(String saida) {
        this.saida = saida;
    }

    @Override
    protected LogFactory criarLog() {
        return new LogFactoryImplArquivoTxt(saida);
    }
}
