package br.com.gabrielferreira.pizzaria.factory;

import br.com.gabrielferreira.pizzaria.ingrediente.CriarIngrediente;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;

import java.util.List;

public interface GerarPizzaFactory {

    CriarPizza criarPizza();

    List<CriarIngrediente> criarIngredientes();
}
