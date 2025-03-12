package br.com.gabrielferreira.funcionario.profissao.impl;

import br.com.gabrielferreira.funcionario.profissao.Gerente;

import java.math.BigDecimal;

public class GerenteImpl implements Gerente {

    private boolean executado;

    @Override
    public void contratar() {
        System.out.println("Contratando funcionário");
        executado = true;
    }

    @Override
    public void treinar() {
        System.out.println("Treinando funcionário");
        executado = true;
    }

    @Override
    public BigDecimal salario() {
        return BigDecimal.valueOf(10000.00);
    }

    @Override
    public boolean executado() {
        return executado;
    }

    @Override
    public BigDecimal adicionarBonus() {
        return salario().add(BigDecimal.valueOf(1000.00));
    }
}
