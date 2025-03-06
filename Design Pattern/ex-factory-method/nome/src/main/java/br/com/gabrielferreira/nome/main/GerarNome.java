package br.com.gabrielferreira.nome.main;

import br.com.gabrielferreira.nome.nomes.GerarNomeCompleto;
import br.com.gabrielferreira.nome.nomes.impl.GerarNomeSobrenomeImpl;
import br.com.gabrielferreira.nome.nomes.impl.GerarSobrenomeNomeImpl;

public class GerarNome {

    public static void main(String[] args) {
        GerarNomeCompleto nomeSobrenome = new GerarNomeSobrenomeImpl();
        System.out.println(nomeSobrenome.gerarNomeCompleto("Gabriel", "Ferreira"));

        GerarNomeCompleto sobrenomeNome = new GerarSobrenomeNomeImpl();
        System.out.println(sobrenomeNome.gerarNomeCompleto("Gabriel", "Ferreira"));
    }
}
