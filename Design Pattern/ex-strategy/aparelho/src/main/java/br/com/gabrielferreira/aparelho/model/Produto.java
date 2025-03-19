package br.com.gabrielferreira.aparelho.model;

import java.io.Serializable;
import java.math.BigDecimal;

public record Produto(
        String nome,
        String descricao,
        BigDecimal valor
) implements Serializable {
}
