package br.com.gabrielferreira.figuras.model;

import br.com.gabrielferreira.figuras.visitor.CalculoAreaVisitor;

public class Circulo implements CalculoArea {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {}

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculoArea(CalculoAreaVisitor calculoAreaVisitor) {
        return calculoAreaVisitor.calculoArea(this);
    }
}
