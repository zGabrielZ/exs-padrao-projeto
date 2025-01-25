package br.com.gabrielferreira.main;

import br.com.gabrielferreira.contador.GerarContador;
import br.com.gabrielferreira.contador.GerarContadorArquivo;
import br.com.gabrielferreira.contador.GerarContadorConsole;

public class GerarContadorMain {

    public static void main(String[] args) {
        GerarContador gerarContadorConsole = new GerarContadorConsole();
        gerarContadorConsole.gerarContador(1, 10);

        GerarContador gerarContadorArquivo = new GerarContadorArquivo();
        gerarContadorArquivo.gerarContador(1, 10);
    }
}
