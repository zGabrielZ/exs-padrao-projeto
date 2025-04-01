package br.com.gabrielferreira.figuras.visitor.impl;

import br.com.gabrielferreira.figuras.model.Circulo;
import br.com.gabrielferreira.figuras.model.Quadrado;
import br.com.gabrielferreira.figuras.model.Retangulo;
import br.com.gabrielferreira.figuras.model.Triangulo;
import br.com.gabrielferreira.figuras.visitor.CalculoAreaVisitor;

public class CalculoAreaVisitorImpl implements CalculoAreaVisitor {
    @Override
    public double calculoArea(Circulo circulo) {
        return Math.PI * Math.pow(circulo.getRaio(), 2);
    }

    @Override
    public double calculoArea(Quadrado quadrado) {
        return Math.pow(quadrado.getLado(), 2);
    }

    @Override
    public double calculoArea(Triangulo triangulo) {
        return (triangulo.getBase() * triangulo.getAltura()) / 2;
    }

    @Override
    public double calculoArea(Retangulo retangulo) {
        return retangulo.getLargura() * retangulo.getAltura();
    }
}
