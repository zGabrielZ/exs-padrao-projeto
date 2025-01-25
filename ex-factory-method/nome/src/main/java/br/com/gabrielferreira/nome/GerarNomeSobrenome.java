package br.com.gabrielferreira.nome;

import br.com.gabrielferreira.factory.NomeFactory;
import br.com.gabrielferreira.factory.NomeSobrenomeFactory;

public class GerarNomeSobrenome extends GerarNomeCompleto {

    @Override
    protected NomeFactory criarNome() {
        return new NomeSobrenomeFactory();
    }
}
