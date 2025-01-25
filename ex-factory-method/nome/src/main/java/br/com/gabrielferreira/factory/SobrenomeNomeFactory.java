package br.com.gabrielferreira.factory;

public class SobrenomeNomeFactory implements NomeFactory {

    @Override
    public String gerarNomeSobrenome(String nome, String sobrenome) {
        return sobrenome.concat(", ").concat(nome);
    }
}
