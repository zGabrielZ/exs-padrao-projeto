package br.com.gabrielferreira.sort.algorithms.impl;

import br.com.gabrielferreira.sort.algorithms.Sorter;

public class SelectionSortImpl implements Sorter {

    private boolean isExecuted;

    @Override
    public void execute() {
        System.out.println("Exemplo de código com o selection sort");
        isExecuted = true;
    }

    @Override
    public boolean isExecuted() {
        return isExecuted;
    }
}
