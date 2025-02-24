package br.com.gabrielferreira.pizzaria.factory.impl;

import br.com.gabrielferreira.pizzaria.model.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerarPizzaImplQuatroQueijoImplTest {

    private GerarPizzaImpl gerarPizzaImpl;

    @BeforeEach
    void setUp() {
        gerarPizzaImpl = new GerarPizzaImpl(new GerarPizzaQuatroQueijoImpl());
    }

    @Test
    @DisplayName("Deve gerar pizza quatro queijo")
    void deveGerarPizzaQuatroQueijo() {
        Pizza pizza = gerarPizzaImpl.fabricarPizza();
        Assertions.assertEquals("Pizza de quatro queijo", pizza.getNome());
        Assertions.assertEquals(3, pizza.getIngredientes().size());
    }
}
