package br.com.gabrielferreira.pizzaria.factory.impl;

import br.com.gabrielferreira.pizzaria.model.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerarPizzaImplPeitoPeruImplTest {

    private GerarPizzaImpl gerarPizzaImpl;

    @BeforeEach
    void setUp() {
        gerarPizzaImpl = new GerarPizzaImpl(new GerarPizzaPeitoPeruImpl());
    }

    @Test
    @DisplayName("Deve gerar pizza peito peru")
    void deveGerarPizzaCalabresa() {
        Pizza pizza = gerarPizzaImpl.fabricarPizza();
        Assertions.assertEquals("Pizza de peito de peru", pizza.getNome());
        Assertions.assertEquals(3, pizza.getIngredientes().size());
    }
}
