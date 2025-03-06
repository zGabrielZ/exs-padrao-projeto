package br.com.gabrielferreira.nome.nomes;

import br.com.gabrielferreira.nome.factory.NomeFactory;

public abstract class GerarNomeCompleto {

    protected abstract NomeFactory criarNome();

    public String gerarNomeCompleto(String nome, String sobrenome) {
        return criarNome().gerarNomeSobrenome(nome, sobrenome);
    }
}
