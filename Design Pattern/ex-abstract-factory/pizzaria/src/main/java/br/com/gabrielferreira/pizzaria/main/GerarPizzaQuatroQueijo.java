package br.com.gabrielferreira.pizzaria.main;

import br.com.gabrielferreira.pizzaria.factory.impl.GerarPizzaImpl;
import br.com.gabrielferreira.pizzaria.factory.impl.GerarPizzaQuatroQueijoImpl;

public class GerarPizzaQuatroQueijo {

    public static void main(String[] args) {
        GerarPizzaImpl gerarPizzaImpl = new GerarPizzaImpl(new GerarPizzaQuatroQueijoImpl());
        System.out.println(gerarPizzaImpl.fabricarPizza());
    }
}
