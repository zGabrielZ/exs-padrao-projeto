package br.com.gabrielferreira.model;

import br.com.gabrielferreira.model.builder.ProdutoBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoTest {

    @Test
    @DisplayName("Deve criar produto")
    void deveCriarNotaFiscal() {
        Produto produto = new ProdutoBuilder()
                .comNome("Banana")
                .comQuantidade(2)
                .comValor(BigDecimal.valueOf(2.50))
                .construir();

        assertEquals("Banana", produto.getNome());
        assertEquals(2, produto.getQuantidade());
        assertEquals(BigDecimal.valueOf(2.50), produto.getValor());
    }
}
