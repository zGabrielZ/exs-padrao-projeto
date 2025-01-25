package br.com.gabrielferreira.model;

import br.com.gabrielferreira.model.builder.NotaFiscalBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NotaFiscalTest {

    @Test
    @DisplayName("Deve criar nota fiscal")
    void deveCriarNotaFiscal() {
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .comNumero("1")
                .comDataEmissao("10/04/2025")
                .comProduto("Banana", 2, BigDecimal.valueOf(2.00))
                .comProduto("Maça", 5, BigDecimal.valueOf(2.00))
                .construir();

        assertEquals("1", notaFiscal.getNumero());
        assertEquals(LocalDate.of(2025, 4, 10), notaFiscal.getDataEmissao());
        assertFalse(notaFiscal.getProdutos().isEmpty());
    }
}
