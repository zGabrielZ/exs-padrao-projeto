package br.com.gabrielferreira.email.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "contatos")
public class ContatoList implements Serializable {

    @Serial
    private static final long serialVersionUID = 8447519026094324112L;

    private List<Contato> contatos = new ArrayList<>();

    public ContatoList() {}

    public ContatoList(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @XmlElement(name = "contato")
    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
