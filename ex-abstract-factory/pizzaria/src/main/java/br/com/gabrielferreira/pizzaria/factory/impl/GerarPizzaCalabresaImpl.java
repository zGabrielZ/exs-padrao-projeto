package br.com.gabrielferreira.pizzaria.factory.impl;

import br.com.gabrielferreira.pizzaria.factory.GerarPizzaFactory;
import br.com.gabrielferreira.pizzaria.ingrediente.CriarIngrediente;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredienteAzeitonasImpl;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredienteCalabresaImpl;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredienteMolhoTomateImpl;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;
import br.com.gabrielferreira.pizzaria.pizza.impl.CriarPizzaCalabresaImpl;

import java.util.Arrays;
import java.util.List;

public class GerarPizzaCalabresaImpl implements GerarPizzaFactory {

    @Override
    public CriarPizza criarPizza() {
        return new CriarPizzaCalabresaImpl();
    }

    @Override
    public List<CriarIngrediente> criarIngredientes() {
        CriarIngrediente azeitonas = new CriarIngredienteAzeitonasImpl();
        CriarIngrediente calabresa = new CriarIngredienteCalabresaImpl();
        CriarIngrediente molhoTomate = new CriarIngredienteMolhoTomateImpl();

        return Arrays.asList(azeitonas, calabresa, molhoTomate);
    }
}
