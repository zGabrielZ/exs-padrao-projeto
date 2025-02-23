package br.com.gabrielferreira.contador.contadores.impl;

import br.com.gabrielferreira.contador.contadores.GerarContador;
import br.com.gabrielferreira.contador.factory.impl.ContadorConsoleFactoryImpl;
import br.com.gabrielferreira.contador.factory.ContadorFactory;

public class GerarContadorConsoleImpl extends GerarContador {

    @Override
    protected ContadorFactory criarContador() {
        return new ContadorConsoleFactoryImpl();
    }

}
