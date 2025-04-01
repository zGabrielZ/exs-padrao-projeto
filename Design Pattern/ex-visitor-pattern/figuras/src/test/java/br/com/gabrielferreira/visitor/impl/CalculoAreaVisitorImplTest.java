package br.com.gabrielferreira.visitor.impl;

import br.com.gabrielferreira.figuras.model.Circulo;
import br.com.gabrielferreira.figuras.model.Quadrado;
import br.com.gabrielferreira.figuras.model.Retangulo;
import br.com.gabrielferreira.figuras.model.Triangulo;
import br.com.gabrielferreira.figuras.visitor.CalculoAreaVisitor;
import br.com.gabrielferreira.figuras.visitor.impl.CalculoAreaVisitorImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculoAreaVisitorImplTest {

    private CalculoAreaVisitor calculoAreaVisitor;

    @Test
    @DisplayName("Deve calcular a área de um círculo")
    void deveCalcularAreaCirculo() {
        calculoAreaVisitor = new CalculoAreaVisitorImpl();
        assertEquals(12.566370614359172, calculoAreaVisitor.calculoArea(new Circulo(2)));
    }

    @Test
    @DisplayName("Deve calcular a área de um quadrado")
    void deveCalcularAreaQuadrado() {
        calculoAreaVisitor = new CalculoAreaVisitorImpl();
        assertEquals(4, calculoAreaVisitor.calculoArea(new Quadrado(2)));
    }

    @Test
    @DisplayName("Deve calcular a área de um triângulo")
    void deveCalcularAreaTriangulo() {
        calculoAreaVisitor = new CalculoAreaVisitorImpl();
        assertEquals(3, calculoAreaVisitor.calculoArea(new Triangulo(2, 3)));
    }

    @Test
    @DisplayName("Deve calcular a área de um retângulo")
    void deveCalcularAreaRetangulo() {
        calculoAreaVisitor = new CalculoAreaVisitorImpl();
        assertEquals(6, calculoAreaVisitor.calculoArea(new Retangulo(2, 3)));
    }

}