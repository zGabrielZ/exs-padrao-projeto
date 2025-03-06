package br.com.gabrielferreira.pedido.xml.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serial;
import java.io.Serializable;

@XmlRootElement(name = "pedido")
public class PedidoXML implements Serializable {

    @Serial
    private static final long serialVersionUID = 5238352878042981688L;

    private String descricao;

    private double valor;

    public PedidoXML() {}

    public PedidoXML(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @XmlElement(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlElement(name = "valor")
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
