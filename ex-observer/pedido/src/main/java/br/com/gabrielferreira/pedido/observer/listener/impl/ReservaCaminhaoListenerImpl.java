package br.com.gabrielferreira.pedido.observer.listener.impl;

import br.com.gabrielferreira.pedido.model.Pedido;
import br.com.gabrielferreira.pedido.observer.listener.Listener;
import br.com.gabrielferreira.pedido.observer.notifier.Notifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReservaCaminhaoListenerImpl implements Listener {

    private static final Logger logger = LoggerFactory.getLogger(ReservaCaminhaoListenerImpl.class);

    public ReservaCaminhaoListenerImpl(Notifier notifier) {
        notifier.registrarListener(this);
    }

    @Override
    public void enviarNotificacao(Pedido pedido) {
        if (pedido != null) {
            logger.info("Enviando notificação para a reserva do caminhão para realizar a entrada do pedido");
            pedido.itens().forEach(itemPedido -> {
                logger.info("Pedido: {}", itemPedido.descricao());
                logger.info("Valor do pedido: {}", itemPedido.valor());
            });
        }
    }
}
