package br.com.gabrielferreira.nome.factory.impl;

import br.com.gabrielferreira.nome.factory.NomeFactory;

public class NomeSobrenomeFactoryImpl implements NomeFactory {

    @Override
    public String gerarNomeSobrenome(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}
