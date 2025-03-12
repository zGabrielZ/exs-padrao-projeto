package br.com.gabrielferreira.funcionario.profissao.impl;

import br.com.gabrielferreira.funcionario.profissao.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioImplTest {

    private Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new FuncionarioImpl();
    }

    @Test
    @DisplayName("Deve retornar o salário do funcionário")
    void deveRetornarSalarioFuncionario() {
        assertEquals(5500.00, funcionario.salario().doubleValue());
    }
}