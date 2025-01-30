package br.com.gabrielferreira.nome.main;

import br.com.gabrielferreira.nome.nomes.GerarNomeCompleto;
import br.com.gabrielferreira.nome.nomes.GerarNomeSobrenome;
import br.com.gabrielferreira.nome.nomes.GerarSobrenomeNome;

public class GerarNome {

    public static void main(String[] args) {
        GerarNomeCompleto nomeSobrenome = new GerarNomeSobrenome();
        System.out.println(nomeSobrenome.gerarNomeCompleto("Gabriel", "Ferreira"));

        GerarNomeCompleto sobrenomeNome = new GerarSobrenomeNome();
        System.out.println(sobrenomeNome.gerarNomeCompleto("Gabriel", "Ferreira"));
    }
}
