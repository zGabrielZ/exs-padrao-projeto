package br.com.gabrielferreira.log.calculadoraimposto;

import br.com.gabrielferreira.log.factory.LogFactory;
import br.com.gabrielferreira.log.factory.LogFactoryArquivoTxt;

public class CalculadoraImpostoArquivoTxt extends CalculadoraImposto {

    private final String saida;

    public CalculadoraImpostoArquivoTxt(String saida) {
        this.saida = saida;
    }

    @Override
    protected LogFactory criarLog() {
        return new LogFactoryArquivoTxt(saida);
    }
}
