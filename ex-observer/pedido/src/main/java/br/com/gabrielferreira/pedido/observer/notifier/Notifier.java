package br.com.gabrielferreira.pedido.observer.notifier;

import br.com.gabrielferreira.pedido.observer.listener.Listener;

public interface Notifier {

    void registrarListener(Listener listener);

    void removerListener(Listener listener);

    void notificarListeners();
}
