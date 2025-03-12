package br.com.gabrielferreira.funcionario.profissao.impl;

import br.com.gabrielferreira.funcionario.profissao.CEO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CEOImplTest {

    private CEO ceo;

    @BeforeEach
    void setUp() {
        ceo = new CEOImpl();
    }

    @Test
    @DisplayName("Deve realizar decisões")
    void deveRealizarDecisoes() {
        ceo.decisoes();
        assertTrue(ceo.executado());
    }

    @Test
    @DisplayName("Deve adicionar lucro")
    void deveAdicionarLucro() {
        ceo.adicionarLucro();
        assertTrue(ceo.executado());
    }

    @Test
    @DisplayName("Deve retornar salário")
    void deveRetornarSalario() {
        assertEquals(100000.00, ceo.salario().doubleValue());
    }

    @Test
    @DisplayName("Deve retornar salário com bônus")
    void deveRetornarSalarioComBonus() {
        assertEquals(110000.00, ceo.adicionarBonus().doubleValue());
    }
}