package br.com.gabrielferreira.notafiscal.main;

import br.com.gabrielferreira.notafiscal.imposto.CalcularImposto;
import br.com.gabrielferreira.notafiscal.imposto.impl.CalcularImpostoPessoaFisicaImpl;
import br.com.gabrielferreira.notafiscal.imposto.impl.CalcularImpostoPessoaJuridicaImpl;
import br.com.gabrielferreira.notafiscal.model.NotaFiscal;
import br.com.gabrielferreira.notafiscal.model.builder.NotaFiscalBuilder;

import java.math.BigDecimal;

public class GerarNotaFiscal {

    public static void main(String[] args) {
        CalcularImposto calcularImposto;
        NotaFiscal notaFiscalPessoaFisica = new NotaFiscalBuilder()
                .comNumero("1")
                .comDataEmissao("10/04/2025")
                .comProduto("Banana", 2, BigDecimal.valueOf(2.00))
                .comProduto("Maça", 5, BigDecimal.valueOf(2.00))
                .construir();

        calcularImposto = new CalcularImpostoPessoaFisicaImpl();
        System.out.println("Valor total da nota físcal pessoa física " + calcularImposto.calcularImposto(notaFiscalPessoaFisica));

        NotaFiscal notaFiscalPessoaJuridica = new NotaFiscalBuilder()
                .comNumero("2")
                .comDataEmissao("11/03/2025")
                .comProduto("Banana", 2, BigDecimal.valueOf(2.00))
                .comProduto("Maça", 5, BigDecimal.valueOf(2.50))
                .comProduto("Melão", 10, BigDecimal.valueOf(5.00))
                .construir();

        calcularImposto = new CalcularImpostoPessoaJuridicaImpl();
        System.out.println("Valor total da nota físcal pessoa juridica " + calcularImposto.calcularImposto(notaFiscalPessoaJuridica));
    }
}
