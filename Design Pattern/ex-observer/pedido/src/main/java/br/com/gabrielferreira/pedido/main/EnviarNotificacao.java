package br.com.gabrielferreira.pedido.main;

import br.com.gabrielferreira.pedido.model.Pedido;
import br.com.gabrielferreira.pedido.observer.listener.impl.FaturamentoVendaListenerImpl;
import br.com.gabrielferreira.pedido.observer.listener.impl.ReservaCaminhaoListenerImpl;
import br.com.gabrielferreira.pedido.observer.notifier.Notifier;
import br.com.gabrielferreira.pedido.observer.notifier.impl.NotifierPedidosImpl;
import br.com.gabrielferreira.pedido.xml.PedidoXML;

public class EnviarNotificacao {

    public static void main(String[] args) {
        PedidoXML pedidoXML = new PedidoXML("pedidos.xml");
        Pedido pedido = pedidoXML.getPedido();
        Notifier notifier = new NotifierPedidosImpl(pedido);

        new FaturamentoVendaListenerImpl(notifier);
        new ReservaCaminhaoListenerImpl(notifier);

        notifier.notificarListeners();
    }
}
