package br.com.gabrielferreira.notafiscal.imposto;

import br.com.gabrielferreira.notafiscal.model.NotaFiscal;
import br.com.gabrielferreira.notafiscal.model.builder.NotaFiscalBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CalcularImpostoPessoaFisicaTest {

    private CalcularImposto calcularImposto;

    @BeforeEach
    void setUp() {
        calcularImposto = new CalcularImpostoPessoaFisica();
    }

    @Test
    @DisplayName("Deve calcular imposto pessoa fisica")
    void deveCalcularImpostoPessoaFisica() {
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .comNumero("1")
                .comDataEmissao("10/04/2025")
                .comProduto("Banana", 10, BigDecimal.valueOf(2.00))
                .comProduto("Maça", 10, BigDecimal.valueOf(2.00))
                .construir();
        BigDecimal valorTotal = calcularImposto.calcularImposto(notaFiscal);
        Assertions.assertEquals(BigDecimal.valueOf(37.20).setScale(2, RoundingMode.HALF_EVEN), valorTotal.setScale(2, RoundingMode.HALF_EVEN));
    }
}
