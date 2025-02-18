package br.com.gabrielferreira.pizzaria.pizza.impl;

import br.com.gabrielferreira.pizzaria.model.Ingrediente;
import br.com.gabrielferreira.pizzaria.model.Pizza;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;

import java.util.List;

public class CriarPizzaPeitoPeruImpl implements CriarPizza {

    @Override
    public Pizza criarPizza(List<Ingrediente> ingredientes) {
        Pizza pizza = new Pizza();
        pizza.setNome("Pizza de peito de peru");
        pizza.setDescricao("Pizza de peito de peru, queijo mussarela, requeijão, peito de peru fatiado");
        pizza.setIngredientes(ingredientes);
        return pizza;
    }
}
