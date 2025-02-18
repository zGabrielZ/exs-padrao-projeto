package br.com.gabrielferreira.pizzaria.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pizza implements Serializable {

    @Serial
    private static final long serialVersionUID = 727674167052545280L;

    private String nome;

    private String descricao;

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Pizza(String nome, String descricao, List<Ingrediente> ingredientes) {
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
    }

    public Pizza() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(nome, pizza.nome) && Objects.equals(descricao, pizza.descricao) && Objects.equals(ingredientes, pizza.ingredientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, ingredientes);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
