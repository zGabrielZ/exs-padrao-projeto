package br.com.gabrielferreira.pizzaria.factory;

import br.com.gabrielferreira.pizzaria.model.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerarPizzaPeitoPeruTest {

    private GerarPizza gerarPizza;

    @BeforeEach
    void setUp() {
        gerarPizza = new GerarPizza(new GerarPizzaPeitoPeru());
    }

    @Test
    @DisplayName("Deve gerar pizza peito peru")
    void deveGerarPizzaCalabresa() {
        Pizza pizza = gerarPizza.fabricarPizza();
        Assertions.assertEquals("Pizza de peito de peru", pizza.getNome());
        Assertions.assertEquals(3, pizza.getIngredientes().size());
    }
}
