package br.com.gabrielferreira.pedido.observer.notifier.impl;

import br.com.gabrielferreira.pedido.model.Pedido;
import br.com.gabrielferreira.pedido.observer.listener.Listener;
import br.com.gabrielferreira.pedido.observer.notifier.Notifier;

import java.util.HashSet;
import java.util.Set;

public class NotifierPedidosImpl implements Notifier {

    private final Set<Listener> listeners;
    private final Pedido pedido;
    private boolean enviado;

    public NotifierPedidosImpl(Pedido pedido) {
        this.listeners = new HashSet<>();
        this.pedido = pedido;
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
        listeners.forEach(listener -> listener.enviarNotificacao(pedido));
        enviado = true;
    }

    public boolean isEnviado() {
        return enviado;
    }
}
