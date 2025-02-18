package br.com.gabrielferreira.pizzaria.pizza;

import br.com.gabrielferreira.pizzaria.model.Ingrediente;
import br.com.gabrielferreira.pizzaria.model.Pizza;

import java.util.List;

public interface CriarPizza {

    Pizza criarPizza(List<Ingrediente> ingredientes);
}
