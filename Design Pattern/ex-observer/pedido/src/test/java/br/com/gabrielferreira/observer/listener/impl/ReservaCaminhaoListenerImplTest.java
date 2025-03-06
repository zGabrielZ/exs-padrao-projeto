package br.com.gabrielferreira.observer.listener.impl;

import br.com.gabrielferreira.pedido.model.Pedido;
import br.com.gabrielferreira.pedido.observer.listener.impl.ReservaCaminhaoListenerImpl;
import br.com.gabrielferreira.pedido.observer.notifier.impl.NotifierPedidosImpl;
import br.com.gabrielferreira.pedido.xml.PedidoXML;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReservaCaminhaoListenerImplTest {

    private NotifierPedidosImpl notifier;

    @BeforeEach
    void setUp() {
        Pedido pedido = new PedidoXML("pedidos.xml").getPedido();
        notifier = new NotifierPedidosImpl(pedido);
        new ReservaCaminhaoListenerImpl(notifier);
    }

    @Test
    @DisplayName("Deve notificar reserva caminhão")
    void deveNotificarReservaCaminhao() {
        notifier.notificarListeners();
        Assertions.assertTrue(notifier.isEnviado());
    }
}
