package br.com.gabrielferreira.model.builder;

import br.com.gabrielferreira.model.Produto;

import java.math.BigDecimal;

public class ProdutoBuilder {

    private final Produto instancia;

    public ProdutoBuilder() {
        this.instancia = new Produto();
    }

    public ProdutoBuilder comNome(String nome) {
        this.instancia.setNome(nome);
        return this;
    }

    public ProdutoBuilder comQuantidade(Integer quantidade) {
        this.instancia.setQuantidade(quantidade);
        return this;
    }

    public ProdutoBuilder comValor(BigDecimal valor) {
        this.instancia.setValor(valor);
        return this;
    }

    public Produto construir() {
        return this.instancia;
    }
}
