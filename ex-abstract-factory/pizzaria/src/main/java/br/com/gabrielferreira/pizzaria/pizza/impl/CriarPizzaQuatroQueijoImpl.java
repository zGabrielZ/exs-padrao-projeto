package br.com.gabrielferreira.pizzaria.pizza.impl;

import br.com.gabrielferreira.pizzaria.model.Ingrediente;
import br.com.gabrielferreira.pizzaria.model.Pizza;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;

import java.util.List;

public class CriarPizzaQuatroQueijoImpl implements CriarPizza {

    @Override
    public Pizza criarPizza(List<Ingrediente> ingredientes) {
        Pizza pizza = new Pizza();
        pizza.setNome("Pizza de quatro queijo");
        pizza.setDescricao("Uma pizza saborosa que vale a pena a compra !!!");
        pizza.setIngredientes(ingredientes);
        return pizza;
    }
}
