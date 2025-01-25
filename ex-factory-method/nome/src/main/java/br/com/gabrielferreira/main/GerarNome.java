package br.com.gabrielferreira.main;

import br.com.gabrielferreira.nome.GerarNomeCompleto;
import br.com.gabrielferreira.nome.GerarNomeSobrenome;
import br.com.gabrielferreira.nome.GerarSobrenomeNome;

public class GerarNome {

    public static void main(String[] args) {
        GerarNomeCompleto nomeSobrenome = new GerarNomeSobrenome();
        System.out.println(nomeSobrenome.gerarNomeCompleto("Gabriel", "Ferreira"));

        GerarNomeCompleto sobrenomeNome = new GerarSobrenomeNome();
        System.out.println(sobrenomeNome.gerarNomeCompleto("Gabriel", "Ferreira"));
    }
}
