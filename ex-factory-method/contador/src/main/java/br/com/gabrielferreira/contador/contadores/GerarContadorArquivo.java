package br.com.gabrielferreira.contador.contadores;

import br.com.gabrielferreira.contador.factory.ContadorArquivoFactory;
import br.com.gabrielferreira.contador.factory.ContadorFactory;

public class GerarContadorArquivo extends GerarContador {

    @Override
    protected ContadorFactory criarContador() {
        return new ContadorArquivoFactory();
    }
}
