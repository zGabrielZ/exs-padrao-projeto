package br.com.gabrielferreira.notafiscal.model.builder;

import br.com.gabrielferreira.notafiscal.model.NotaFiscal;
import br.com.gabrielferreira.notafiscal.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

public class NotaFiscalBuilder {

    private final NotaFiscal instancia;

    public NotaFiscalBuilder() {
        this.instancia = new NotaFiscal();
    }

    public NotaFiscalBuilder comNumero(String numero) {
        this.instancia.setNumero(numero);
        return this;
    }

    public NotaFiscalBuilder comDataEmissao(String dataEmissao) {
        LocalDate dataEmissaoFormat = LocalDate.parse(dataEmissao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.instancia.setDataEmissao(dataEmissaoFormat);
        return this;
    }

    public NotaFiscalBuilder comProduto(String nome, Integer quantidade, BigDecimal valor) {
        Produto produto = new ProdutoBuilder()
                .comNome(nome)
                .comQuantidade(quantidade)
                .comValor(valor)
                .construir();

        if (Objects.isNull(this.instancia.getProdutos())) {
            this.instancia.setProdutos(new ArrayList<>());
        }
        this.instancia.getProdutos().add(produto);
        return this;
    }

    public NotaFiscal construir() {
        return this.instancia;
    }
}
