package br.com.gabrielferreira.pizzaria.factory;

import br.com.gabrielferreira.pizzaria.model.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerarPizzaQuatroQueijoTest {

    private GerarPizza gerarPizza;

    @BeforeEach
    void setUp() {
        gerarPizza = new GerarPizza(new GerarPizzaQuatroQueijo());
    }

    @Test
    @DisplayName("Deve gerar pizza quatro queijo")
    void deveGerarPizzaQuatroQueijo() {
        Pizza pizza = gerarPizza.fabricarPizza();
        Assertions.assertEquals("Pizza de quatro queijo", pizza.getNome());
        Assertions.assertEquals(3, pizza.getIngredientes().size());
    }
}
