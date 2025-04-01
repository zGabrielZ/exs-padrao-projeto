package br.com.gabrielferreira.figuras.model;

import br.com.gabrielferreira.figuras.visitor.CalculoAreaVisitor;

public class Quadrado implements CalculoArea {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {}

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculoArea(CalculoAreaVisitor calculoAreaVisitor) {
        return calculoAreaVisitor.calculoArea(this);
    }
}
