package br.com.gabrielferreira.sort.main;

import br.com.gabrielferreira.sort.algorithms.impl.InsertionSortImpl;
import br.com.gabrielferreira.sort.algorithms.impl.MergeSortImpl;
import br.com.gabrielferreira.sort.algorithms.impl.SelectionSortImpl;
import br.com.gabrielferreira.sort.algorithms.processor.SorterProcessor;

public class App {

    public static void main(String[] args) {
        SorterProcessor.process(new InsertionSortImpl());

        SorterProcessor.process(new MergeSortImpl());

        SorterProcessor.process(new SelectionSortImpl());
    }
}
