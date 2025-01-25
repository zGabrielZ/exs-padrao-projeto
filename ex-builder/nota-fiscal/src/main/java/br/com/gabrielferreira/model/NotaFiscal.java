package br.com.gabrielferreira.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class NotaFiscal implements Serializable {

    @Serial
    private static final long serialVersionUID = -8247340894627548248L;

    private String numero;

    private LocalDate dataEmissao;

    private List<Produto> produtos;

    public NotaFiscal() {}

    public NotaFiscal(String numero, LocalDate dataEmissao, List<Produto> produtos) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.produtos = produtos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal getValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            valorTotal = valorTotal.add(BigDecimal.valueOf(produto.getQuantidade()).multiply(produto.getValor()));
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numero='" + numero + '\'' +
                ", dataEmissao=" + dataEmissao +
                ", produtos=" + produtos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscal that = (NotaFiscal) o;
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
