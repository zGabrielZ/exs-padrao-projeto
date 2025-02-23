package br.com.gabrielferreira.contador.contadores.factory.impl;

import br.com.gabrielferreira.contador.contadores.factory.ContadorFactory;

import static br.com.gabrielferreira.contador.util.LoggerUtil.info;

public class ContadorConsoleFactoryImpl implements ContadorFactory {

    @Override
    public void gerarContador(Integer inicio, Integer fim) {
        for (int i = inicio; i <= fim; i++) {
            info("Número: " + i);
        }
    }
}
