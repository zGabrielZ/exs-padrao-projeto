package br.com.gabrielferreira.funcionario.profissao;

import java.math.BigDecimal;

public interface Gerente extends Funcionario {

    void contratar();

    void treinar();

    BigDecimal adicionarBonus();
}
