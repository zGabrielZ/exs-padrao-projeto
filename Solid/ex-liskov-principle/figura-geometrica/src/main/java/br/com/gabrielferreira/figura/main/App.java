package br.com.gabrielferreira.figura.main;

import br.com.gabrielferreira.figura.model.Circulo;
import br.com.gabrielferreira.figura.model.Forma;
import br.com.gabrielferreira.figura.model.Retangulo;
import br.com.gabrielferreira.figura.util.CalcularArea;

public class App {

    public static void main(String[] args) {
        Forma circulo = new Circulo(10);
        System.out.println(CalcularArea.calcular(circulo));

        Forma retangulo = new Retangulo(10, 20);
        System.out.println(CalcularArea.calcular(retangulo));
    }
}
