package br.com.gabrielferreira.figura.model;

public class Circulo extends Forma {

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
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
