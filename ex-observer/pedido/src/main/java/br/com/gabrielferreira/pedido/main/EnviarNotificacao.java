package br.com.gabrielferreira.pedido.main;

import br.com.gabrielferreira.pedido.listeners.impl.FaturamentoVendaListenerImpl;
import br.com.gabrielferreira.pedido.listeners.impl.ReservaCaminhaoListenerImpl;
import br.com.gabrielferreira.pedido.model.PedidoList;
import br.com.gabrielferreira.pedido.notifier.Notifier;
import br.com.gabrielferreira.pedido.notifier.impl.NotifierPedidos;
import br.com.gabrielferreira.pedido.xml.PedidoXML;

public class EnviarNotificacao {

    public static void main(String[] args) {
        PedidoXML pedidoXML = new PedidoXML("pedidos.xml");
        PedidoList pedidoList = pedidoXML.getPedidoList();
        Notifier notifier = new NotifierPedidos(pedidoList);

        new FaturamentoVendaListenerImpl(notifier);
        new ReservaCaminhaoListenerImpl(notifier);

        notifier.notificarListeners();
    }
}
