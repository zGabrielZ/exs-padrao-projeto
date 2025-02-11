package br.com.gabrielferreira.venda.produto;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Produto implements Serializable {

    @Serial
    private static final long serialVersionUID = 727674167052545280L;

    private String descricao;

    private BigDecimal valor;

    private BigDecimal valorLiquido;

    public Produto() {}

    public Produto(String descricao, BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", valorLiquido=" + valorLiquido +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(descricao, produto.descricao) && Objects.equals(valor, produto.valor) && Objects.equals(valorLiquido, produto.valorLiquido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, valor, valorLiquido);
    }
}
