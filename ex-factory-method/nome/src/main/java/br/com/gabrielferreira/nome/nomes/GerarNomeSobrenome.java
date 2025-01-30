package br.com.gabrielferreira.nome.nomes;

import br.com.gabrielferreira.nome.factory.NomeFactory;
import br.com.gabrielferreira.nome.factory.NomeSobrenomeFactory;

public class GerarNomeSobrenome extends GerarNomeCompleto {

    @Override
    protected NomeFactory criarNome() {
        return new NomeSobrenomeFactory();
    }
}
