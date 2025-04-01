package br.com.gabrielferreira.figuras.model;

import br.com.gabrielferreira.figuras.visitor.CalculoAreaVisitor;

public interface CalculoArea {

    double calculoArea(CalculoAreaVisitor calculoAreaVisitor);
}
