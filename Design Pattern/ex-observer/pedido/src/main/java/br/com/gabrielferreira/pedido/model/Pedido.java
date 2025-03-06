package br.com.gabrielferreira.pedido.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public record Pedido(
        List<ItemPedido> itens
) implements Serializable {

    @Override
    public List<ItemPedido> itens() {
        return itens == null ? new ArrayList<>() : itens;
    }

    public double valorTotalPedido() {
        return this.itens.stream()
                .mapToDouble(ItemPedido::valor)
                .sum();
    }
}
