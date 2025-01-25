package br.com.gabrielferreira.contador;

import br.com.gabrielferreira.factory.ContadorConsoleFactory;
import br.com.gabrielferreira.factory.ContadorFactory;

public class GerarContadorConsole extends GerarContador {

    @Override
    protected ContadorFactory criarContador() {
        return new ContadorConsoleFactory();
    }

}
