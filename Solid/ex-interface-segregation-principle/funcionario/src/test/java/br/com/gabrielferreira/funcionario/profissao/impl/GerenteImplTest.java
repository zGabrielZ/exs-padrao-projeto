package br.com.gabrielferreira.funcionario.profissao.impl;

import br.com.gabrielferreira.funcionario.profissao.Gerente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GerenteImplTest {

    private Gerente gerente;

    @BeforeEach
    void setUp() {
        gerente = new GerenteImpl();
    }

    @Test
    @DisplayName("Deve contratar um funcionário")
    void deveContratarFuncionario() {
        gerente.contratar();
        assertTrue(gerente.executado());
    }

    @Test
    @DisplayName("Deve treinar um funcionário")
    void deveTreinarFuncionario() {
        gerente.treinar();
        assertTrue(gerente.executado());
    }

    @Test
    @DisplayName("Deve retornar o salário de um gerente")
    void deveRetornarSalarioGerente() {
        assertEquals(10000.00, gerente.salario().doubleValue());
    }

    @Test
    @DisplayName("Deve adicionar um bônus ao salário de um gerente")
    void deveAdicionarBonusSalarioGerente() {
        assertEquals(11000.00, gerente.adicionarBonus().doubleValue());
    }
}