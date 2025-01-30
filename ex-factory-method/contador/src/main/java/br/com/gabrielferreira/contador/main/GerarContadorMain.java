package br.com.gabrielferreira.contador.main;

import br.com.gabrielferreira.contador.contadores.GerarContador;
import br.com.gabrielferreira.contador.contadores.GerarContadorArquivo;
import br.com.gabrielferreira.contador.contadores.GerarContadorConsole;

public class GerarContadorMain {

    public static void main(String[] args) {
        GerarContador gerarContadorConsole = new GerarContadorConsole();
        gerarContadorConsole.gerarContador(1, 10);

        GerarContador gerarContadorArquivo = new GerarContadorArquivo();
        gerarContadorArquivo.gerarContador(1, 10);
    }
}
