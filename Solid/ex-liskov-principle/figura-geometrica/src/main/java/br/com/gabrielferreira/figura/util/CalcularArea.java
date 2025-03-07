package br.com.gabrielferreira.figura.util;

import br.com.gabrielferreira.figura.model.Forma;

public class CalcularArea {

    private CalcularArea() {}

    public static double calcular(Forma forma) {
        return forma.getArea();
    }
}
