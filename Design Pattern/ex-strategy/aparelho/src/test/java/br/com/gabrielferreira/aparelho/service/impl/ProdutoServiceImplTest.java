package br.com.gabrielferreira.aparelho.service.impl;

import br.com.gabrielferreira.aparelho.model.Produto;
import br.com.gabrielferreira.aparelho.service.ProdutoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProdutoServiceImplTest {

    private ProdutoService produtoService;

    @Test
    @DisplayName("Deve criar celular")
    void deveCriarCelular() {
        produtoService = new ProdutoServiceImpl(new CelularServiceImpl());

        Produto produto = produtoService.criar();
        assertNotNull(produto);
        assertEquals("Iphone 15", produto.nome());
        assertEquals("Este celular é muito bom", produto.descricao());
        assertEquals(BigDecimal.valueOf(5500.00).setScale(2, RoundingMode.HALF_EVEN), produto.valor().setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    @DisplayName("Deve criar notebook")
    void deveCriarNotebook() {
        produtoService = new ProdutoServiceImpl(new NotebookServiceImpl());

        Produto produto = produtoService.criar();
        assertNotNull(produto);
        assertEquals("Acer aspire 3", produto.nome());
        assertEquals("Este notebook é muito bom", produto.descricao());
        assertEquals(BigDecimal.valueOf(2500.00).setScale(2, RoundingMode.HALF_EVEN), produto.valor().setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    @DisplayName("Deve criar televisão")
    void deveCriarTelevisao() {
        produtoService = new ProdutoServiceImpl(new TVServiceImpl());

        Produto produto = produtoService.criar();
        assertNotNull(produto);
        assertEquals("TV Smart Ultra HD 65", produto.nome());
        assertEquals("Esta televisão é muito boa", produto.descricao());
        assertEquals(BigDecimal.valueOf(3500.00).setScale(2, RoundingMode.HALF_EVEN), produto.valor().setScale(2, RoundingMode.HALF_EVEN));
    }

}