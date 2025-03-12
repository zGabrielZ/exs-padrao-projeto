package br.com.gabrielferreira.funcionario.profissao.impl;

import br.com.gabrielferreira.funcionario.profissao.CEO;

import java.math.BigDecimal;

public class CEOImpl implements CEO {

    private boolean executado;

    @Override
    public void decisoes() {
        System.out.println("Tomando decisões");
        executado = true;
    }

    @Override
    public void adicionarLucro() {
        System.out.println("Adicionando lucro");
        executado = true;
    }

    @Override
    public BigDecimal salario() {
        return BigDecimal.valueOf(100000.00);
    }

    @Override
    public boolean executado() {
        return executado;
    }

    @Override
    public BigDecimal adicionarBonus() {
        return salario().add(BigDecimal.valueOf(10000.00));
    }
}
