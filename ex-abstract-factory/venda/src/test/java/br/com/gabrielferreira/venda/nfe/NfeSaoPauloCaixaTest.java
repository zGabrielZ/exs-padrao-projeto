package br.com.gabrielferreira.venda.nfe;

import br.com.gabrielferreira.venda.produto.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

class NfeSaoPauloCaixaTest {

    private GerarNfe gerarNfe;

    private Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto("Iphone 15", BigDecimal.valueOf(4500.00));
        gerarNfe = new GerarNfe(new NfeSaoPauloCaixa());
    }

    @Test
    @DisplayName("Deve gerar nfe sao paulo caixa")
    void deveGerarNfe() {
        String gerado = gerarNfe.gerarVenda(produto);
        Assertions.assertEquals(mensagemNfe(), gerado);
        Assertions.assertEquals(BigDecimal.valueOf(5310.00).setScale(2, RoundingMode.HALF_EVEN), produto.getValorLiquido().setScale(2, RoundingMode.HALF_EVEN));
    }

    private String mensagemNfe() {
        return  "Boleto bancário gerado pela Caixa Economica Federal \n" +
                "Nome do produto: " + produto.getDescricao() + " \n" +
                "Valor bruto do produto: " + produto.getValor() + " \n" +
                "Valor após o cálculo do imposto: " + produto.getValorLiquido();
    }
}
