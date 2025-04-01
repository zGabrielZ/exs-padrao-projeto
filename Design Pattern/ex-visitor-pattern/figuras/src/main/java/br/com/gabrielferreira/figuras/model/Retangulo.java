package br.com.gabrielferreira.figuras.model;

import br.com.gabrielferreira.figuras.visitor.CalculoAreaVisitor;

public class Retangulo implements CalculoArea {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo() {}

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calculoArea(CalculoAreaVisitor visitor) {
        return visitor.calculoArea(this);
    }
}
