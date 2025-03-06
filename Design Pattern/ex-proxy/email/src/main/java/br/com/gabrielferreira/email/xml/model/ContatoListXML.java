package br.com.gabrielferreira.email.xml.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "contatos")
public class ContatoListXML implements Serializable {

    @Serial
    private static final long serialVersionUID = 8447519026094324112L;

    private List<ContatoXML> contatoXMLS = new ArrayList<>();

    public ContatoListXML() {}

    public ContatoListXML(List<ContatoXML> contatoXMLS) {
        this.contatoXMLS = contatoXMLS;
    }

    @XmlElement(name = "contato")
    public List<ContatoXML> getContatos() {
        return contatoXMLS;
    }

    public void setContatos(List<ContatoXML> contatoXMLS) {
        this.contatoXMLS = contatoXMLS;
    }
}
