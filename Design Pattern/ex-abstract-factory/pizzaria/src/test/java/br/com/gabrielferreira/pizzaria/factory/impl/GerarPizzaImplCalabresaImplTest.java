package br.com.gabrielferreira.pizzaria.factory.impl;

import br.com.gabrielferreira.pizzaria.model.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerarPizzaImplCalabresaImplTest {

    private GerarPizzaImpl gerarPizzaImpl;

    @BeforeEach
    void setUp() {
        gerarPizzaImpl = new GerarPizzaImpl(new GerarPizzaCalabresaImpl());
    }

    @Test
    @DisplayName("Deve gerar pizza calabresa")
    void deveGerarPizzaCalabresa() {
        Pizza pizza = gerarPizzaImpl.fabricarPizza();
        Assertions.assertEquals("Pizza de calabresa", pizza.getNome());
        Assertions.assertEquals(3, pizza.getIngredientes().size());
    }
}
