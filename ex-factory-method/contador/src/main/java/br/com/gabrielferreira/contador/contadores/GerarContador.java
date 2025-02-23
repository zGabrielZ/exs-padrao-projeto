package br.com.gabrielferreira.contador.contadores;

import br.com.gabrielferreira.contador.contadores.factory.ContadorFactory;

public abstract class GerarContador {

    protected abstract ContadorFactory criarContador();

    public void gerarContador(Integer inicio, Integer fim) {
        criarContador().gerarContador(inicio, fim);
    }
}
