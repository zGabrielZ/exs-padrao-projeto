package br.com.gabrielferreira.pedido.observer.listener;

import br.com.gabrielferreira.pedido.model.Pedido;

public interface Listener {

    void enviarNotificacao(Pedido pedido);
}
