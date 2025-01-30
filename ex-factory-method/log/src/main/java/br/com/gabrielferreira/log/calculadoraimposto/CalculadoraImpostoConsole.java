package br.com.gabrielferreira.log.calculadoraimposto;

import br.com.gabrielferreira.log.factory.LogFactory;
import br.com.gabrielferreira.log.factory.LogFactoryConsole;

public class CalculadoraImpostoConsole extends CalculadoraImposto {

    @Override
    protected LogFactory criarLog() {
        return new LogFactoryConsole();
    }
}
