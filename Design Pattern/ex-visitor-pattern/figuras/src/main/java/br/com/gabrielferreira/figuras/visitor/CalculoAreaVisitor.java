package br.com.gabrielferreira.figuras.visitor;

import br.com.gabrielferreira.figuras.model.Circulo;
import br.com.gabrielferreira.figuras.model.Quadrado;
import br.com.gabrielferreira.figuras.model.Retangulo;
import br.com.gabrielferreira.figuras.model.Triangulo;

public interface CalculoAreaVisitor {

    double calculoArea(Circulo circulo);
    double calculoArea(Quadrado quadrado);
    double calculoArea(Triangulo triangulo);
    double calculoArea(Retangulo retangulo);
}
