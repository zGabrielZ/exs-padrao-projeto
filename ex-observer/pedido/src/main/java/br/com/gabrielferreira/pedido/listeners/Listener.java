package br.com.gabrielferreira.pedido.listeners;

import br.com.gabrielferreira.pedido.model.PedidoList;

public interface Listener {

    void enviarNotificacao(PedidoList pedidoList);
}
