package br.com.gabrielferreira.pizzaria.factory;

import br.com.gabrielferreira.pizzaria.ingrediente.CriarIngrediente;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredienteMolhoTomateImpl;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredienteQueijoImpl;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredienteRequeijaoImpl;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;
import br.com.gabrielferreira.pizzaria.pizza.impl.CriarPizzaQuatroQueijoImpl;

import java.util.Arrays;
import java.util.List;

public class GerarPizzaQuatroQueijo implements GerarPizzaFactory {

    @Override
    public CriarPizza criarPizza() {
        return new CriarPizzaQuatroQueijoImpl();
    }

    @Override
    public List<CriarIngrediente> criarIngredientes() {
        CriarIngrediente molhoTomate = new CriarIngredienteMolhoTomateImpl();
        CriarIngrediente queijo = new CriarIngredienteQueijoImpl();
        CriarIngrediente requeijao = new CriarIngredienteRequeijaoImpl();

        return Arrays.asList(molhoTomate, queijo, requeijao);
    }
}
