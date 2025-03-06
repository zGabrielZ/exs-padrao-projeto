package br.com.gabrielferreira.nome.factory.impl;

import br.com.gabrielferreira.nome.factory.NomeFactory;

public class SobrenomeNomeFactoryImpl implements NomeFactory {

    @Override
    public String gerarNomeSobrenome(String nome, String sobrenome) {
        return sobrenome.concat(", ").concat(nome);
    }
}
