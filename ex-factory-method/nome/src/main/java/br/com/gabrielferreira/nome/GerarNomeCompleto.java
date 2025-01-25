package br.com.gabrielferreira.nome;

import br.com.gabrielferreira.factory.NomeFactory;

public abstract class GerarNomeCompleto {

    protected abstract NomeFactory criarNome();

    public String gerarNomeCompleto(String nome, String sobrenome) {
        return criarNome().gerarNomeSobrenome(nome, sobrenome);
    }
}
