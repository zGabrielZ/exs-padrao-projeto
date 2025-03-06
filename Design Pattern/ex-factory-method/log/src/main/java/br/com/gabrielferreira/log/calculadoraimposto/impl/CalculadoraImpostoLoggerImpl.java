package br.com.gabrielferreira.log.calculadoraimposto.impl;

import br.com.gabrielferreira.log.calculadoraimposto.CalculadoraImposto;
import br.com.gabrielferreira.log.factory.LogFactory;
import br.com.gabrielferreira.log.factory.impl.LogFactoryImplLogger;

public class CalculadoraImpostoLoggerImpl extends CalculadoraImposto {

    @Override
    protected LogFactory criarLog() {
        return new LogFactoryImplLogger();
    }
}
