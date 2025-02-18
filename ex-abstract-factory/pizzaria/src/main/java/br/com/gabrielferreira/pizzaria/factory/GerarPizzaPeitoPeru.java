package br.com.gabrielferreira.pizzaria.factory;

import br.com.gabrielferreira.pizzaria.ingrediente.CriarIngrediente;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredienteMolhoTomateImpl;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredientePeitoPeruImpl;
import br.com.gabrielferreira.pizzaria.ingrediente.impl.CriarIngredienteQueijoImpl;
import br.com.gabrielferreira.pizzaria.pizza.CriarPizza;
import br.com.gabrielferreira.pizzaria.pizza.impl.CriarPizzaPeitoPeruImpl;

import java.util.Arrays;
import java.util.List;

public class GerarPizzaPeitoPeru implements GerarPizzaFactory {

    @Override
    public CriarPizza criarPizza() {
        return new CriarPizzaPeitoPeruImpl();
    }

    @Override
    public List<CriarIngrediente> criarIngredientes() {
        CriarIngrediente molhoTomate = new CriarIngredienteMolhoTomateImpl();
        CriarIngrediente queijo = new CriarIngredienteQueijoImpl();
        CriarIngrediente peitoPeru = new CriarIngredientePeitoPeruImpl();

        return Arrays.asList(molhoTomate, queijo, peitoPeru);
    }
}
