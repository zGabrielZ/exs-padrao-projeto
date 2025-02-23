package br.com.gabrielferreira.pedido.observer.listener.impl;

import br.com.gabrielferreira.pedido.model.Pedido;
import br.com.gabrielferreira.pedido.observer.listener.Listener;
import br.com.gabrielferreira.pedido.observer.notifier.Notifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FaturamentoVendaListenerImpl implements Listener {

    private static final Logger logger = LoggerFactory.getLogger(FaturamentoVendaListenerImpl.class);

    public FaturamentoVendaListenerImpl(Notifier notifier) {
        notifier.registrarListener(this);
    }

    @Override
    public void enviarNotificacao(Pedido pedido) {
        if (pedido != null) {
            logger.info("Valor total do pedido: {}", pedido.valorTotalPedido());
        }
    }
}
