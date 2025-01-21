package br.com.gabrielferreira.calculadoraimposto;

import br.com.gabrielferreira.factory.LogFactory;
import br.com.gabrielferreira.factory.LogFactoryLogger;

public class CalculadoraImpostoLogger extends CalculadoraImposto {

    @Override
    protected LogFactory criarLog() {
        return new LogFactoryLogger();
    }
}
