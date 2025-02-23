package br.com.gabrielferreira.pedido.notifier.impl;

import br.com.gabrielferreira.pedido.listeners.Listener;
import br.com.gabrielferreira.pedido.model.PedidoList;
import br.com.gabrielferreira.pedido.notifier.Notifier;

import java.util.HashSet;
import java.util.Set;

public class NotifierPedidos implements Notifier {

    private final Set<Listener> listeners;
    private final PedidoList pedidoList;
    private boolean enviado;

    public NotifierPedidos(PedidoList pedidoList) {
        this.listeners = new HashSet<>();
        this.pedidoList = pedidoList;
    }

    @Override
    public void registrarListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void removerListener(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notificarListeners() {
        listeners.forEach(listener -> listener.enviarNotificacao(pedidoList));
        enviado = true;
    }

    public boolean isEnviado() {
        return enviado;
    }
}
