package br.com.gabrielferreira.calculadoraimposto;

import br.com.gabrielferreira.factory.LogFactory;
import br.com.gabrielferreira.factory.LogFactoryConsole;

public class CalculadoraImpostoConsole extends CalculadoraImposto {

    @Override
    protected LogFactory criarLog() {
        return new LogFactoryConsole();
    }
}
