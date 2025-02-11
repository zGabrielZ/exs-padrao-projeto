package br.com.gabrielferreira.venda.main;

import br.com.gabrielferreira.venda.produto.Produto;
import br.com.gabrielferreira.venda.nfe.GerarNfe;
import br.com.gabrielferreira.venda.nfe.NfeRioDeJaneiroBancoDoBrasil;

import java.math.BigDecimal;

public class GerarNfeRioDeJaneiro {

    public static void main(String[] args) {
        Produto produto = new Produto("Televisão", BigDecimal.valueOf(2000.00));

        GerarNfe gerarNfe = new GerarNfe(new NfeRioDeJaneiroBancoDoBrasil());
        System.out.println(gerarNfe.gerarVenda(produto));
    }
}
