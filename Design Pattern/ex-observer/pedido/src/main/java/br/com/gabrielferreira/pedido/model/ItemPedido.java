package br.com.gabrielferreira.pedido.model;

import java.io.Serializable;

public record ItemPedido(
        String descricao,
        double valor
) implements Serializable {
}
