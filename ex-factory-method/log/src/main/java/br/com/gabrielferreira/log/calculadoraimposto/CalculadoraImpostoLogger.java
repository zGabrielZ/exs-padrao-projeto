package br.com.gabrielferreira.log.calculadoraimposto;

import br.com.gabrielferreira.log.factory.LogFactory;
import br.com.gabrielferreira.log.factory.LogFactoryLogger;

public class CalculadoraImpostoLogger extends CalculadoraImposto {

    @Override
    protected LogFactory criarLog() {
        return new LogFactoryLogger();
    }
}
