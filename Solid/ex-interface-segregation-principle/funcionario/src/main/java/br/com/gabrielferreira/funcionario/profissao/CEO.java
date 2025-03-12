package br.com.gabrielferreira.funcionario.profissao;

import java.math.BigDecimal;

public interface CEO extends Funcionario {

    void decisoes();

    void adicionarLucro();

    BigDecimal adicionarBonus();
}
