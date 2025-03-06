package br.com.gabrielferreira.colecao.main;

import br.com.gabrielferreira.colecao.util.CollectionUtil;
import br.com.gabrielferreira.colecao.util.Processor;
import br.com.gabrielferreira.colecao.violation.ViolationChecker;
import br.com.gabrielferreira.colecao.violation.ViolationRange;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final Integer INICIO = 1;
    private static final Integer LIMITE = 5;

    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao sistema de coleção de números!");

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 5 números inteiros validos num range de 0 a 10:");

        for (int i = INICIO; i <= LIMITE; i++) {
            String valor = Processor.input();

            if (!ViolationChecker.isValid(valor)) {
                System.out.println("O valor digitado não é válido.");
                return;
            }

            Integer numero = Integer.parseInt(valor);
            if (!ViolationRange.isValid(numero)) {
                System.out.println("O valor digitado não está no range permitido.");
                return;
            }

            numeros.add(numero);
        }

        Processor.close();

        List<Integer> numerosValidos = CollectionUtil.order(numeros);
        numerosValidos.forEach(numeroValido -> System.out.print(numeroValido + " "));
    }
}
