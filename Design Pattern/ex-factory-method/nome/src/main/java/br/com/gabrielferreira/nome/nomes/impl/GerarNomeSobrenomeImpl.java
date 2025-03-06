package br.com.gabrielferreira.nome.nomes.impl;

import br.com.gabrielferreira.nome.factory.NomeFactory;
import br.com.gabrielferreira.nome.factory.impl.NomeSobrenomeFactoryImpl;
import br.com.gabrielferreira.nome.nomes.GerarNomeCompleto;

public class GerarNomeSobrenomeImpl extends GerarNomeCompleto {

    @Override
    protected NomeFactory criarNome() {
        return new NomeSobrenomeFactoryImpl();
    }
}
