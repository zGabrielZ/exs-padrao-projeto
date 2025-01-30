package br.com.gabrielferreira.contador.contadores;

import br.com.gabrielferreira.contador.factory.ContadorConsoleFactory;
import br.com.gabrielferreira.contador.factory.ContadorFactory;

public class GerarContadorConsole extends GerarContador {

    @Override
    protected ContadorFactory criarContador() {
        return new ContadorConsoleFactory();
    }

}
