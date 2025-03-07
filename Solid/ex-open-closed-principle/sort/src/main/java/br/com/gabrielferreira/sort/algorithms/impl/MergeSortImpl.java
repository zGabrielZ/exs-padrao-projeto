package br.com.gabrielferreira.sort.algorithms.impl;

import br.com.gabrielferreira.sort.algorithms.Sorter;

public class MergeSortImpl implements Sorter {

    private boolean isExecuted;

    @Override
    public void execute() {
        System.out.println("Exemplo de código merge sort");
        isExecuted = true;
    }

    @Override
    public boolean isExecuted() {
        return isExecuted;
    }
}
