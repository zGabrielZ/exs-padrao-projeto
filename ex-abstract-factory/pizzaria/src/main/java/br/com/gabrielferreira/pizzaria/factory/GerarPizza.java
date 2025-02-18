package br.com.gabrielferreira.pizzaria.factory;

import br.com.gabrielferreira.pizzaria.ingrediente.CriarIngrediente;
import br.com.gabrielferreira.pizzaria.model.Ingrediente;
import br.com.gabrielferreira.pizzaria.model.Pizza;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;

import java.util.ArrayList;
import java.util.List;

public class GerarPizza {

    private final CriarPizza criarPizza;
    private final List<CriarIngrediente> criarIngredientes;

    public GerarPizza(GerarPizzaFactory gerarPizzaFactory) {
        this.criarIngredientes = gerarPizzaFactory.criarIngredientes();
        this.criarPizza = gerarPizzaFactory.criarPizza();
    }

    public Pizza fabricarPizza() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        criarIngredientes.forEach(criarIngrediente -> ingredientes.add(criarIngrediente.criarIngrediente()));
        return this.criarPizza.criarPizza(ingredientes);
    }

}
