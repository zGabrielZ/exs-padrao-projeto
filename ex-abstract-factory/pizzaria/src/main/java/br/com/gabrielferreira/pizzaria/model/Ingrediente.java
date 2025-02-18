package br.com.gabrielferreira.pizzaria.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Ingrediente implements Serializable {

    @Serial
    private static final long serialVersionUID = 727674167052545280L;

    private String nome;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public Ingrediente() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingrediente that = (Ingrediente) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
