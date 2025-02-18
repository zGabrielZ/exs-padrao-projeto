package br.com.gabrielferreira.pizzaria.main;

import br.com.gabrielferreira.pizzaria.factory.GerarPizza;

public class GerarPizzaCalabresa {

    public static void main(String[] args) {
        GerarPizza gerarPizza = new GerarPizza(new br.com.gabrielferreira.pizzaria.factory.GerarPizzaCalabresa());
        System.out.println(gerarPizza.fabricarPizza());
    }
}
