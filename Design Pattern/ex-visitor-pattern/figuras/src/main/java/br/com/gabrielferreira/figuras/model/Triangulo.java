package br.com.gabrielferreira.figuras.model;

import br.com.gabrielferreira.figuras.visitor.CalculoAreaVisitor;

public class Triangulo implements CalculoArea {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {}

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculoArea(CalculoAreaVisitor calculoAreaVisitor) {
        return calculoAreaVisitor.calculoArea(this);
    }
}
