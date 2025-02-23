package br.com.gabrielferreira.pedido.listeners.impl;

import br.com.gabrielferreira.pedido.listeners.Listener;
import br.com.gabrielferreira.pedido.model.PedidoList;
import br.com.gabrielferreira.pedido.notifier.Notifier;

public class ReservaCaminhaoListenerImpl implements Listener {

    public ReservaCaminhaoListenerImpl(Notifier notifier) {
        notifier.registrarListener(this);
    }

    @Override
    public void enviarNotificacao(PedidoList pedidoList) {
        if (pedidoList != null) {
            System.out.println("Enviando notificação para a reserva do caminhão para realizar a entrada do pedido");
            pedidoList.getPedidos().forEach(pedido -> {
                System.out.println("Pedido: " + pedido.getDescricao());
                System.out.println("Valor do pedido: " + pedido.getValor());
            });
        }
    }
}
