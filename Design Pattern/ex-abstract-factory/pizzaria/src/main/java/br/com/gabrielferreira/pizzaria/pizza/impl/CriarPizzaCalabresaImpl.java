package br.com.gabrielferreira.pizzaria.pizza.impl;

import br.com.gabrielferreira.pizzaria.model.Ingrediente;
import br.com.gabrielferreira.pizzaria.model.Pizza;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;

import java.util.List;

public class CriarPizzaCalabresaImpl implements CriarPizza {

    @Override
    public Pizza criarPizza(List<Ingrediente> ingredientes) {
        Pizza pizza = new Pizza();
        pizza.setNome("Pizza de calabresa");
        pizza.setDescricao("Pizza de calabresa, molho de tomate e queijo mussarela muito boa !!!");
        pizza.setIngredientes(ingredientes);
        return pizza;
    }
}
