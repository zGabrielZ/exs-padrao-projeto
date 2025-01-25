package br.com.gabrielferreira.main;

import br.com.gabrielferreira.imposto.CalcularImposto;
import br.com.gabrielferreira.imposto.CalcularImpostoPessoaFisica;
import br.com.gabrielferreira.imposto.CalcularImpostoPessoaJuridica;
import br.com.gabrielferreira.model.NotaFiscal;
import br.com.gabrielferreira.model.builder.NotaFiscalBuilder;

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

        calcularImposto = new CalcularImpostoPessoaFisica();
        System.out.println("Valor total da nota físcal pessoa física " + calcularImposto.calcularImposto(notaFiscalPessoaFisica));

        NotaFiscal notaFiscalPessoaJuridica = new NotaFiscalBuilder()
                .comNumero("2")
                .comDataEmissao("11/03/2025")
                .comProduto("Banana", 2, BigDecimal.valueOf(2.00))
                .comProduto("Maça", 5, BigDecimal.valueOf(2.50))
                .comProduto("Melão", 10, BigDecimal.valueOf(5.00))
                .construir();

        calcularImposto = new CalcularImpostoPessoaJuridica();
        System.out.println("Valor total da nota físcal pessoa juridica " + calcularImposto.calcularImposto(notaFiscalPessoaJuridica));
    }
}
