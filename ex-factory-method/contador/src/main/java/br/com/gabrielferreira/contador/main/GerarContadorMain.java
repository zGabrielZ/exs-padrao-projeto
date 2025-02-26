package br.com.gabrielferreira.contador.main;

import br.com.gabrielferreira.contador.contadores.GerarContador;
import br.com.gabrielferreira.contador.contadores.impl.GerarContadorArquivoImpl;
import br.com.gabrielferreira.contador.contadores.impl.GerarContadorConsoleImpl;

import java.io.File;

public class GerarContadorMain {

    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/contador.txt";

    public static void main(String[] args) {
        GerarContador gerarContadorConsole = new GerarContadorConsoleImpl();
        gerarContadorConsole.gerarContador(1, 10);

        GerarContador gerarContadorArquivo = new GerarContadorArquivoImpl();
        gerarContadorArquivo.gerarContador(1, 10);

        System.out.println("Deletando arquivo contador.txt");
        File file = new File(CAMINHO_COMPLETO);
        boolean delete = file.delete();
        System.out.println("Arquivo deletado? " + delete);
    }
}
