package br.com.gabrielferreira.pedido.listeners.impl;

import br.com.gabrielferreira.pedido.listeners.Listener;
import br.com.gabrielferreira.pedido.model.PedidoList;
import br.com.gabrielferreira.pedido.notifier.Notifier;

public class FaturamentoVendaListenerImpl implements Listener {

    public FaturamentoVendaListenerImpl(Notifier notifier) {
        notifier.registrarListener(this);
    }

    @Override
    public void enviarNotificacao(PedidoList pedidoList) {
        if (pedidoList != null) {
            System.out.println("Valor total do pedido: " + pedidoList.getValorTotalPedido());
        }
    }
}
