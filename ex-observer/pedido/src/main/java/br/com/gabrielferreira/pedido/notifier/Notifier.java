package br.com.gabrielferreira.pedido.notifier;

import br.com.gabrielferreira.pedido.listeners.Listener;

public interface Notifier {

    void registrarListener(Listener listener);

    void removerListener(Listener listener);

    void notificarListeners();
}
