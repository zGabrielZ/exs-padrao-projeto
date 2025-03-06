package br.com.gabrielferreira.nome.nomes.impl;

import br.com.gabrielferreira.nome.factory.NomeFactory;
import br.com.gabrielferreira.nome.factory.impl.SobrenomeNomeFactoryImpl;
import br.com.gabrielferreira.nome.nomes.GerarNomeCompleto;

public class GerarSobrenomeNomeImpl extends GerarNomeCompleto {

    @Override
    protected NomeFactory criarNome() {
        return new SobrenomeNomeFactoryImpl();
    }
}
