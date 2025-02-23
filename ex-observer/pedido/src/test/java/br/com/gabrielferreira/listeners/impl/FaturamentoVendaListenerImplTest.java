package br.com.gabrielferreira.listeners.impl;

import br.com.gabrielferreira.pedido.listeners.impl.FaturamentoVendaListenerImpl;
import br.com.gabrielferreira.pedido.model.PedidoList;
import br.com.gabrielferreira.pedido.notifier.impl.NotifierPedidos;
import br.com.gabrielferreira.pedido.xml.PedidoXML;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FaturamentoVendaListenerImplTest {

    private NotifierPedidos notifier;

    @BeforeEach
    void setUp() {
        PedidoList pedidoList = new PedidoXML("pedidos.xml").getPedidoList();
        notifier = new NotifierPedidos(pedidoList);
        new FaturamentoVendaListenerImpl(notifier);
    }

    @Test
    @DisplayName("Deve notificar faturamento venda")
    void deveNotificarFaturamentoVenda() {
        notifier.notificarListeners();
        Assertions.assertTrue(notifier.isEnviado());
    }
}
