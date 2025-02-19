package br.com.gabrielferreira.email.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serial;
import java.io.Serializable;

@XmlRootElement(name = "contato")
public class Contato implements Serializable {

    @Serial
    private static final long serialVersionUID = -784585585843395629L;

    private String nome;

    private String email;

    private boolean blackList;

    public Contato() {}

    public Contato(String nome, String email, boolean blackList) {
        this.nome = nome;
        this.email = email;
        this.blackList = blackList;
    }

    @XmlElement(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "blacklist")
    public boolean isBlackList() {
        return blackList;
    }

    public void setBlackList(boolean blackList) {
        this.blackList = blackList;
    }
}
