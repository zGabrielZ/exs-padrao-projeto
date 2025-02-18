package br.com.gabrielferreira.pizzaria.main;

import br.com.gabrielferreira.pizzaria.factory.GerarPizza;

public class GerarPizzaQuatroQueijo {

    public static void main(String[] args) {
        GerarPizza gerarPizza = new GerarPizza(new br.com.gabrielferreira.pizzaria.factory.GerarPizzaQuatroQueijo());
        System.out.println(gerarPizza.fabricarPizza());
    }
}
