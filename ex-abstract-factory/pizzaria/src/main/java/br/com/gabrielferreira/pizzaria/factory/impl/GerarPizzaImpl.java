package br.com.gabrielferreira.pizzaria.factory.impl;

import br.com.gabrielferreira.pizzaria.factory.GerarPizzaFactory;
import br.com.gabrielferreira.pizzaria.ingrediente.CriarIngrediente;
import br.com.gabrielferreira.pizzaria.model.Ingrediente;
import br.com.gabrielferreira.pizzaria.model.Pizza;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;

import java.util.ArrayList;
import java.util.List;

public class GerarPizzaImpl {

    private final CriarPizza criarPizza;
    private final List<CriarIngrediente> criarIngredientes;

    public GerarPizzaImpl(GerarPizzaFactory gerarPizzaFactory) {
        this.criarIngredientes = gerarPizzaFactory.criarIngredientes();
        this.criarPizza = gerarPizzaFactory.criarPizza();
    }

    public Pizza fabricarPizza() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        criarIngredientes.forEach(criarIngrediente -> ingredientes.add(criarIngrediente.criarIngrediente()));
        return this.criarPizza.criarPizza(ingredientes);
    }

}
