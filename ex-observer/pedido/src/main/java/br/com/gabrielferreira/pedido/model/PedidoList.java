package br.com.gabrielferreira.pedido.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "pedidos")
public class PedidoList implements Serializable {

    @Serial
    private static final long serialVersionUID = -821370218723355976L;

    private List<Pedido> pedidos = new ArrayList<>();

    public PedidoList() {}

    public PedidoList(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public double getValorTotalPedido() {
        return this.pedidos.stream()
                .mapToDouble(Pedido::getValor)
                .sum();
    }

    @XmlElement(name = "pedido")
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
