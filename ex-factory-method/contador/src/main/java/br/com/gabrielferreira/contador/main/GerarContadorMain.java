package br.com.gabrielferreira.contador.main;

import br.com.gabrielferreira.contador.contadores.GerarContador;
import br.com.gabrielferreira.contador.contadores.impl.GerarContadorArquivoImpl;
import br.com.gabrielferreira.contador.contadores.impl.GerarContadorConsoleImpl;

public class GerarContadorMain {

    public static void main(String[] args) {
        GerarContador gerarContadorConsole = new GerarContadorConsoleImpl();
        gerarContadorConsole.gerarContador(1, 10);

        GerarContador gerarContadorArquivo = new GerarContadorArquivoImpl();
        gerarContadorArquivo.gerarContador(1, 10);
    }
}
