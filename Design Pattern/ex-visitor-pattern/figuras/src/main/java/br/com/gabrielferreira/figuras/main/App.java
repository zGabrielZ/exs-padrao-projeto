package br.com.gabrielferreira.figuras.main;

import br.com.gabrielferreira.figuras.model.Circulo;
import br.com.gabrielferreira.figuras.model.Quadrado;
import br.com.gabrielferreira.figuras.model.Retangulo;
import br.com.gabrielferreira.figuras.model.Triangulo;
import br.com.gabrielferreira.figuras.visitor.CalculoAreaVisitor;
import br.com.gabrielferreira.figuras.visitor.impl.CalculoAreaVisitorImpl;

public class App {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);
        Triangulo triangulo = new Triangulo(10, 5);
        Retangulo retangulo = new Retangulo(10, 5);
        Circulo circulo = new Circulo(10);

        CalculoAreaVisitor calculoAreaVisitor = new CalculoAreaVisitorImpl();
        System.out.println("Área do quadrado: " + calculoAreaVisitor.calculoArea(quadrado));
        System.out.println("Área do triângulo: " + calculoAreaVisitor.calculoArea(triangulo));
        System.out.println("Área do retângulo: " + calculoAreaVisitor.calculoArea(retangulo));
        System.out.println("Área do círculo: " + calculoAreaVisitor.calculoArea(circulo));
    }
}
