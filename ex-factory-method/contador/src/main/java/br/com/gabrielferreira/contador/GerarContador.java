package br.com.gabrielferreira.contador;

import br.com.gabrielferreira.factory.ContadorFactory;

public abstract class GerarContador {

    protected abstract ContadorFactory criarContador();

    public void gerarContador(Integer inicio, Integer fim) {
        criarContador().gerarContador(inicio, fim);
    }
}
