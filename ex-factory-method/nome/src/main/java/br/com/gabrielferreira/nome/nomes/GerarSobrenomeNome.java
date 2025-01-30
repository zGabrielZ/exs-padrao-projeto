package br.com.gabrielferreira.nome.nomes;

import br.com.gabrielferreira.nome.factory.NomeFactory;
import br.com.gabrielferreira.nome.factory.SobrenomeNomeFactory;

public class GerarSobrenomeNome extends GerarNomeCompleto {

    @Override
    protected NomeFactory criarNome() {
        return new SobrenomeNomeFactory();
    }
}
