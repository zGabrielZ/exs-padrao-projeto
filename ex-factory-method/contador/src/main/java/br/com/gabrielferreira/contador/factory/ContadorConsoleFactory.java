package br.com.gabrielferreira.contador.factory;

public class ContadorConsoleFactory implements ContadorFactory {

    @Override
    public void gerarContador(Integer inicio, Integer fim) {
        for (int i = inicio; i <= fim; i++) {
            System.out.println("Número: " + i);
        }
    }
}
