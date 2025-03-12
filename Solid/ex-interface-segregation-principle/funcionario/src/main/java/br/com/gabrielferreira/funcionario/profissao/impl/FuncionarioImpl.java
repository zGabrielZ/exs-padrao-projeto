package br.com.gabrielferreira.funcionario.profissao.impl;

import br.com.gabrielferreira.funcionario.profissao.Funcionario;

import java.math.BigDecimal;

public class FuncionarioImpl implements Funcionario {

    private boolean executado;

    @Override
    public BigDecimal salario() {
        return BigDecimal.valueOf(5500.00);
    }

    @Override
    public boolean executado() {
        return executado;
    }
}
