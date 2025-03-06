package br.com.gabrielferreira.pedido.xml.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "pedidos")
public class PedidoXMLList implements Serializable {

    @Serial
    private static final long serialVersionUID = -821370218723355976L;

    private List<PedidoXML> pedidoXMLS = new ArrayList<>();

    public PedidoXMLList() {}

    public PedidoXMLList(List<PedidoXML> pedidoXMLS) {
        this.pedidoXMLS = pedidoXMLS;
    }

    @XmlElement(name = "pedido")
    public List<PedidoXML> getPedidos() {
        return pedidoXMLS;
    }

    public void setPedidos(List<PedidoXML> pedidoXMLS) {
        this.pedidoXMLS = pedidoXMLS;
    }
}
