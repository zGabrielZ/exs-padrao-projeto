package br.com.gabrielferreira.main;

import br.com.gabrielferreira.calculadoraimposto.CalculadoraImposto;
import br.com.gabrielferreira.calculadoraimposto.CalculadoraImpostoArquivoTxt;
import br.com.gabrielferreira.calculadoraimposto.CalculadoraImpostoConsole;
import br.com.gabrielferreira.calculadoraimposto.CalculadoraImpostoLogger;

import java.math.BigDecimal;

public class CalcularImposto {

    public static void main(String[] args) {
        CalculadoraImposto calculadoraImposto = new CalculadoraImpostoLogger();
        calculadoraImposto.calcular(BigDecimal.valueOf(100.00));

        System.out.println("-----------------------------------------------");

        calculadoraImposto = new CalculadoraImpostoConsole();
        calculadoraImposto.calcular(BigDecimal.valueOf(50.00));

        System.out.println("-----------------------------------------------");

        String saida = System.getProperty("user.home") + "/Downloads/";
        calculadoraImposto = new CalculadoraImpostoArquivoTxt(saida);
        calculadoraImposto.calcular(BigDecimal.valueOf(200.00));
    }
}
