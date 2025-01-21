package br.com.gabrielferreira.calculadoraimposto;

import br.com.gabrielferreira.factory.LogFactory;
import br.com.gabrielferreira.factory.LogFactoryArquivoTxt;

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
