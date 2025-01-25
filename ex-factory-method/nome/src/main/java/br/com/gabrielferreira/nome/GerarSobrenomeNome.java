package br.com.gabrielferreira.nome;

import br.com.gabrielferreira.factory.NomeFactory;
import br.com.gabrielferreira.factory.SobrenomeNomeFactory;

public class GerarSobrenomeNome extends GerarNomeCompleto {

    @Override
    protected NomeFactory criarNome() {
        return new SobrenomeNomeFactory();
    }
}
