package br.com.gabrielferreira.pizzaria.main;

import br.com.gabrielferreira.pizzaria.factory.impl.GerarPizzaCalabresaImpl;
import br.com.gabrielferreira.pizzaria.factory.impl.GerarPizzaImpl;

public class GerarPizzaCalabresa {

    public static void main(String[] args) {
        GerarPizzaImpl gerarPizzaImpl = new GerarPizzaImpl(new GerarPizzaCalabresaImpl());
        System.out.println(gerarPizzaImpl.fabricarPizza());
    }
}
