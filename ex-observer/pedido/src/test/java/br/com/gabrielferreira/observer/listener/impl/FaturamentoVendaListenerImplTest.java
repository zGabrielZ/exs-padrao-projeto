package br.com.gabrielferreira.observer.listener.impl;

import br.com.gabrielferreira.pedido.model.Pedido;
import br.com.gabrielferreira.pedido.observer.listener.impl.FaturamentoVendaListenerImpl;
import br.com.gabrielferreira.pedido.observer.notifier.impl.NotifierPedidosImpl;
import br.com.gabrielferreira.pedido.xml.PedidoXML;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FaturamentoVendaListenerImplTest {

    private NotifierPedidosImpl notifier;

    @BeforeEach
    void setUp() {
        Pedido pedido = new PedidoXML("pedidos.xml").getPedido();
        notifier = new NotifierPedidosImpl(pedido);
        new FaturamentoVendaListenerImpl(notifier);
    }

    @Test
    @DisplayName("Deve notificar faturamento venda")
    void deveNotificarFaturamentoVenda() {
        notifier.notificarListeners();
        Assertions.assertTrue(notifier.isEnviado());
    }
}
