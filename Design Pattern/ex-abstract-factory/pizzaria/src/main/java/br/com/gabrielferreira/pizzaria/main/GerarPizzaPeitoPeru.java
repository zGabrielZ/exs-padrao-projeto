package br.com.gabrielferreira.pizzaria.main;

import br.com.gabrielferreira.pizzaria.factory.impl.GerarPizzaImpl;
import br.com.gabrielferreira.pizzaria.factory.impl.GerarPizzaPeitoPeruImpl;

public class GerarPizzaPeitoPeru {

    public static void main(String[] args) {
        GerarPizzaImpl gerarPizzaImpl = new GerarPizzaImpl(new GerarPizzaPeitoPeruImpl());
        System.out.println(gerarPizzaImpl.fabricarPizza());
    }
}
