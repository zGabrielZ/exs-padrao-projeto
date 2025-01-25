package br.com.gabrielferreira.contador;

import br.com.gabrielferreira.factory.ContadorArquivoFactory;
import br.com.gabrielferreira.factory.ContadorFactory;

public class GerarContadorArquivo extends GerarContador {

    @Override
    protected ContadorFactory criarContador() {
        return new ContadorArquivoFactory();
    }
}
